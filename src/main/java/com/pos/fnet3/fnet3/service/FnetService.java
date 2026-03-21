package com.pos.fnet3.fnet3.service;

import com.pos.fnet3.fnet3.dto.ClienteDTO;
import com.pos.fnet3.fnet3.dto.VentaResponseDTO;
import com.pos.fnet3.soap.*;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.URL;

@Service
public class FnetService {

    private static final Logger log = LoggerFactory.getLogger(FnetService.class);

    @Value("${fnet3.url}")
    private String wsdlUrl;

    @Value("${fnet3.namespace}")
    private String namespace;

    @Value("${fnet3.serviceName}")
    private String serviceName;

    @Value("${fnet3.serial}")
    private long serial;

    @Value("${fnet3.username}")
    private String username;

    @Value("${fnet3.password}")
    private String password;

    private FNETWS018900X port;
    private String sessionID;

    // Se ejecuta una sola vez al iniciar la aplicacion
    @PostConstruct
    private void init() throws Exception {
        log.info("Inicializando conexion con FNET3...");
        URL url = new URL(wsdlUrl);
        QName qname = new QName(namespace, serviceName);
        FNETWS018900XService service = new FNETWS018900XService(url, qname);
        this.port = service.getFNETWS018900XSoap11();
        log.info("Conexion con FNET3 establecida correctamente.");
    }

    private String getSession() throws Exception {
        if (sessionID == null) {
            log.info("Iniciando login con terminal: {}", serial);
            SynchroAndLoginRequest request = new SynchroAndLoginRequest();
            request.setSerialNumber(serial);
            request.setUsername(username);
            request.setPassword(password);
            request.setForeignID(0L);
            sessionID = port.synchroAndLogin(request).getSessionID();
            log.info("Login exitoso. SessionID: {}", sessionID);
        }
        return sessionID;
    }

    public ClienteDTO getCliente() {
        ClienteDTO dto = new ClienteDTO();
        try {
            String sid = getSession();
            GetInfoRequest request = new GetInfoRequest();
            request.setSessionID(sid);
            request.setCustomerID(0L);
            request.setCard("100");
            request.setMobile("");
            request.setEmail("");
            request.setIdentityCard("");
            request.setForeignId("");

            GetInfoResponse info = port.getInfo(request);
            log.info("Cliente obtenido. ID: {}", info.getCustomer().getId());

            dto.setSuccess(true);
            dto.setSessionID(sid);
            dto.setCustomerID(info.getCustomer().getId());
            dto.setNombre(info.getCustomer().getPersonalInfo().getName());
            dto.setApellido(info.getCustomer().getPersonalInfo().getSurname());
            dto.setPuntos(info.getCustomer().getBalanceData().getBalancePoints());

        } catch (Exception e) {
            log.error("Error al obtener cliente: {}", e.getMessage());
            sessionID = null; 
            dto.setSuccess(false);
            dto.setError(e.getMessage());
        }
        return dto;
    }

    public VentaResponseDTO sale(String sessionID, long customerID,
                                  double totalMoney, String notes) {
        VentaResponseDTO dto = new VentaResponseDTO();
        try {
            log.info("Realizando venta. Cliente: {}, Monto: {}", customerID, totalMoney);
            SaleByCardRequest request = new SaleByCardRequest();
            request.setSessionID(sessionID);
            request.setCustomerID(customerID);
            request.setCard("");
            request.setMobile("");
            request.setEmail("");
            request.setIdentityCard("");
            request.setCustomerForeignId("");
            request.setTotalMoney(totalMoney);
            request.setNotes(notes);
            request.setTicketID("");
            request.setForeignId(0);
            request.setSellerCard("");
            request.setPincode("");

            SaleByCardResponse resp = port.saleByCard(request);
            log.info("Venta exitosa. AnswerCode: {}", resp.getAnswerCode());

            dto.setSuccess(true);
            dto.setAnswerCode(resp.getAnswerCode());

        } catch (Exception e) {
            log.error("Error al realizar venta: {}", e.getMessage());
            dto.setSuccess(false);
            dto.setError(e.getMessage());
        }
        return dto;
    }
}