package com.pos.fnet3.fnet3.dto;

import lombok.Data;

@Data
public class LoginResponseDTO {
    private boolean success;
    private String sessionID;
    private String username;
    private String token;
    private String error;
}