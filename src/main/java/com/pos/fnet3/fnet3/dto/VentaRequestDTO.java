package com.pos.fnet3.fnet3.dto;

import lombok.Data;

@Data
public class VentaRequestDTO {
    private long customerID;
    private double totalMoney;
    private String notes;
}