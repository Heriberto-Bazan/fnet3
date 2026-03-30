package com.pos.fnet3.fnet3.controller;

import com.pos.fnet3.fnet3.dto.LoginRequestDTO;
import com.pos.fnet3.fnet3.dto.LoginResponseDTO;
import com.pos.fnet3.fnet3.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<LoginResponseDTO> login(@RequestBody LoginRequestDTO body) {
        LoginResponseDTO dto = authService.login(body);
        if (dto.isSuccess()) {
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dto);
        }
    }


    @PostMapping("/logout")
    public ResponseEntity<Void> logout(HttpServletRequest request) {
        String token = request.getHeader("Authorization").substring(7);
        authService.logout(token);
        return ResponseEntity.ok().build();
    }
}