package com.pos.fnet3.fnet3.service;

import com.pos.fnet3.fnet3.config.FnetConnectionConfig;
import com.pos.fnet3.fnet3.dto.ClienteDTO;
import com.pos.fnet3.fnet3.dto.VentaResponseDTO;
import com.pos.fnet3.soap.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FnetService {

    private static final Logger log = LoggerFactory.getLogger(FnetService.class);

    @Autowired
    private FnetConnectionConfig fnetConnection;

    public ClienteDTO getCliente(String sessionID, String tarjeta) {
        ClienteDTO dto = new ClienteDTO();
        try {
            GetInfoRequest request = new GetInfoRequest();
            request.setSessionID(sessionID);
            request.setCustomerID(0L);
            request.setCard(tarjeta);   // ← tarjeta dinamica
            request.setMobile("");
            request.setEmail("");
            request.setIdentityCard("");
            request.setForeignId("");

            GetInfoResponse info = fnetConnection.getPort().getInfo(request);
            log.info("Cliente obtenido. Tarjeta: {} ID: {}", tarjeta, info.getCustomer().getId());

            dto.setSuccess(true);
            dto.setSessionID(sessionID);
            dto.setCustomerID(info.getCustomer().getId());
            dto.setNombre(info.getCustomer().getPersonalInfo().getName());
            dto.setApellido(info.getCustomer().getPersonalInfo().getSurname());
            dto.setPuntos(info.getCustomer().getBalanceData().getBalancePoints());

        } catch (Exception e) {
            log.error("Error al obtener cliente: {}", e.getMessage());
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

            SaleByCardResponse resp = fnetConnection.getPort().saleByCard(request);
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