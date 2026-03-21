package com.pos.fnet3.fnet3.controller;

import com.pos.fnet3.fnet3.dto.ClienteDTO;
import com.pos.fnet3.fnet3.dto.VentaRequestDTO;
import com.pos.fnet3.fnet3.dto.VentaResponseDTO;
import com.pos.fnet3.fnet3.service.FnetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pos")
@CrossOrigin(origins = "*")
public class PosController {

    @Autowired
    private FnetService fnetService;

    @GetMapping("/cliente")
    public ResponseEntity<ClienteDTO> getCliente() {
        ClienteDTO dto = fnetService.getCliente();
        if (dto.isSuccess()) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
        }
    }

    @PostMapping("/venta")
    public ResponseEntity<VentaResponseDTO> realizarVenta(@RequestBody VentaRequestDTO body) {
        VentaResponseDTO dto = fnetService.sale(
            body.getSessionID(),
            body.getCustomerID(),
            body.getTotalMoney(),
            body.getNotes()
        );
        if (dto.isSuccess()) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
        }
    }
}