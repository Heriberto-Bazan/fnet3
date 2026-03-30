package com.pos.fnet3.fnet3.config;

import com.pos.fnet3.soap.FNETWS018900X;
import com.pos.fnet3.soap.FNETWS018900XService;
import jakarta.annotation.PostConstruct;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.xml.namespace.QName;
import java.net.URL;

@Component
public class FnetConnectionConfig {

    private static final Logger log = LoggerFactory.getLogger(FnetConnectionConfig.class);

    @Value("${fnet3.url}")
    private String wsdlUrl;

    @Value("${fnet3.namespace}")
    private String namespace;

    @Value("${fnet3.serviceName}")
    private String serviceName;

    private FNETWS018900X port;

    @PostConstruct
    public void init() throws Exception {
        log.info("Inicializando conexion con FNET3...");
        URL url = new URL(wsdlUrl);
        QName qname = new QName(namespace, serviceName);
        FNETWS018900XService service = new FNETWS018900XService(url, qname);
        this.port = service.getFNETWS018900XSoap11();
        log.info("Conexion con FNET3 establecida correctamente.");
    }

    public FNETWS018900X getPort() {
        return this.port;
    }
}