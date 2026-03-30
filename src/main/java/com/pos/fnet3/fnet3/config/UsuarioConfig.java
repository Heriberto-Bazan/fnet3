package com.pos.fnet3.fnet3.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Data
@Component
@ConfigurationProperties(prefix = "pos")
public class UsuarioConfig {

    private List<Usuario> usuarios;

    @Data
    public static class Usuario {
        private String username;
        private String password;
        private long serial;
        private String fnetPassword;
    }
}