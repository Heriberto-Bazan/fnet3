package com.pos.fnet3.fnet3.service;

import com.pos.fnet3.soap.*;
import org.springframework.stereotype.Service;

import javax.xml.namespace.QName;
import java.net.URL;

@Service
public class FnetService {

    private static final String WSDL_URL = "https://test113.fidely.net/fnet3web/proxy/wsdl.php?v=01.89";
    private static final String NAMESPACE = "http://FidelyNET3_WS_01_89_00.Local";
    private static final String SERVICE_NAME = "FNETWS_01_89_00_xService";

    private FNETWS018900X getPort() throws Exception {
        URL url = new URL(WSDL_URL);
        QName qname = new QName(NAMESPACE, SERVICE_NAME);
        FNETWS018900XService service = new FNETWS018900XService(url, qname);
        return service.getFNETWS018900XSoap11();
    }

    public SynchroAndLoginResponse login() throws Exception {
        FNETWS018900X port = getPort();
        SynchroAndLoginRequest request = new SynchroAndLoginRequest();
        request.setSerialNumber(8282L);
        request.setUsername("opPruebaDev");
        request.setPassword("opPa$$");
        request.setForeignID(0L);
        return port.synchroAndLogin(request);
    }

    public GetInfoResponse getInfo(String sessionID) throws Exception {
        FNETWS018900X port = getPort();
        GetInfoRequest request = new GetInfoRequest();
        request.setSessionID(sessionID);
        request.setCustomerID(0L);
        request.setCard("100");
        request.setMobile("");
        request.setEmail("");
        request.setIdentityCard("");
        request.setForeignId("");
        return port.getInfo(request);
    }

    public SaleByCardResponse sale(String sessionID, long customerID,
                                    double totalMoney, String notes) throws Exception {
        FNETWS018900X port = getPort();
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
        return port.saleByCard(request);
    }
}