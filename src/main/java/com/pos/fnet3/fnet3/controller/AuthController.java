package com.pos.fnet3.fnet3.controller;

import com.pos.fnet3.fnet3.dto.LoginRequestDTO;
import com.pos.fnet3.fnet3.dto.LoginResponseDTO;
import com.pos.fnet3.fnet3.service.AuthService;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
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
    public ResponseEntity<LoginResponseDTO> login(
            @RequestBody LoginRequestDTO body,
            HttpServletResponse response) {

        LoginResponseDTO dto = authService.login(body);
        if (dto.isSuccess()) {
            // Crea cookie HttpOnly con el token
            Cookie cookie = new Cookie("token", dto.getToken());
            cookie.setHttpOnly(true);  
            cookie.setPath("/");        
            cookie.setMaxAge(900);     
            response.addCookie(cookie);

            dto.setToken(null);
            return ResponseEntity.ok(dto);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body(dto);
        }
    }

    @PostMapping("/logout")
    public ResponseEntity<Void> logout(
            HttpServletRequest request,
            HttpServletResponse response) {

        String token = obtenerTokenDeCookie(request);
        if (token != null) {
            authService.logout(token);
        }

        
        Cookie cookie = new Cookie("token", "");
        cookie.setHttpOnly(true);
        cookie.setPath("/");
        cookie.setMaxAge(0);
        response.addCookie(cookie);

        return ResponseEntity.ok().build();
    }

    // Extrae el token de la cookie
    public static String obtenerTokenDeCookie(HttpServletRequest request) {
        if (request.getCookies() != null) {
            for (Cookie cookie : request.getCookies()) {
                if ("token".equals(cookie.getName())) {
                    return cookie.getValue();
                }
            }
        }
        return null;
    }
}