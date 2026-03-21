package com.pos.fnet3.fnet3.dto;

import lombok.Data;

@Data
public class ClienteDTO {
    private boolean success;
    private String sessionID;
    private long customerID;
    private String nombre;
    private String apellido;
    private double puntos;
    private String error;
}