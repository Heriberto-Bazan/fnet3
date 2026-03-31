package com.pos.fnet3.fnet3.controller;

import com.pos.fnet3.fnet3.dto.ClienteDTO;
import com.pos.fnet3.fnet3.dto.VentaRequestDTO;
import com.pos.fnet3.fnet3.dto.VentaResponseDTO;
import com.pos.fnet3.fnet3.service.AuthService;
import com.pos.fnet3.fnet3.service.FnetService;
import jakarta.servlet.http.HttpServletRequest;
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

    @Autowired
    private AuthService authService;

    @GetMapping("/cliente/{tarjeta}")
    public ResponseEntity<ClienteDTO> getCliente(
            @PathVariable String tarjeta,
            HttpServletRequest request) {
        try {
            String token = AuthController.obtenerTokenDeCookie(request);
            String sessionID = authService.getSession(token);
            ClienteDTO dto = fnetService.getCliente(sessionID, tarjeta);
            if (dto.isSuccess()) {
                return ResponseEntity.ok(dto);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
            }
        } catch (Exception e) {
            ClienteDTO dto = new ClienteDTO();
            dto.setSuccess(false);
            dto.setError(e.getMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dto);
        }
    }

    @PostMapping("/venta")
    public ResponseEntity<VentaResponseDTO> realizarVenta(
            @RequestBody VentaRequestDTO body,
            HttpServletRequest request) {
        try {
            String token = AuthController.obtenerTokenDeCookie(request);
            String sessionID = authService.getSession(token);
            VentaResponseDTO dto = fnetService.sale(
                sessionID,
                body.getCustomerID(),
                body.getTotalMoney(),
                body.getNotes()
            );
            if (dto.isSuccess()) {
                return ResponseEntity.ok(dto);
            } else {
                return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(dto);
            }
        } catch (Exception e) {
            VentaResponseDTO dto = new VentaResponseDTO();
            dto.setSuccess(false);
            dto.setError(e.getMessage());
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dto);
        }
    }
}