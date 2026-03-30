package com.pos.fnet3.fnet3.filters;

import com.pos.fnet3.fnet3.service.JwtService;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import java.io.IOException;

@Component
public class JwtFilter extends OncePerRequestFilter {

    @Autowired
    private JwtService jwtService;

    @Override
    protected void doFilterInternal(HttpServletRequest request,
            HttpServletResponse response,
            FilterChain filterChain)
            throws ServletException, IOException {

        String path = request.getRequestURI();

        if (path.equals("/api/auth/login") ||
                path.startsWith("/css/") ||
                path.startsWith("/js/") ||
                path.equals("/login.html") ||
                path.equals("/cliente.html") ||
                path.equals("/index.html") ||
                path.equals("/")) {
            filterChain.doFilter(request, response);
            return;
        }

        String header = request.getHeader("Authorization");
        if (header == null || !header.startsWith("Bearer ")) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("{\"error\":\"Token requerido.\"}");
            return;
        }

        String token = header.substring(7);

        if (!jwtService.esValido(token)) {
            response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
            response.getWriter().write("{\"error\":\"Token invalido o expirado.\"}");
            return;
        }

        filterChain.doFilter(request, response);
    }
}