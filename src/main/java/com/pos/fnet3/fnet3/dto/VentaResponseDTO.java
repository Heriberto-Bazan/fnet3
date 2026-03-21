package com.pos.fnet3.fnet3.dto;

import lombok.Data;

@Data
public class VentaResponseDTO {
    private boolean success;
    private int answerCode;
    private String error;
}