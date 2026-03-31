package com.pos.fnet3.fnet3.service;

import com.pos.fnet3.fnet3.config.FnetConnectionConfig;
import com.pos.fnet3.fnet3.config.UsuarioConfig;
import com.pos.fnet3.fnet3.dto.LoginRequestDTO;
import com.pos.fnet3.fnet3.dto.LoginResponseDTO;
import com.pos.fnet3.soap.SynchroAndLoginRequest;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class AuthService {

    private static final Logger log = LoggerFactory.getLogger(AuthService.class);

    @Autowired
    private UsuarioConfig usuarioConfig;

    @Autowired
    private FnetConnectionConfig fnetConnection;

    @Autowired
    private JwtService jwtService;

    @Value("${fnet3.serial}")
    private long fnetSerial;

    @Value("${fnet3.username}")
    private String fnetUsername;

    @Value("${fnet3.password}")
    private String fnetPassword;

    private final Argon2PasswordEncoder encoder =
        Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8();

    private final Map<String, String> sesiones = new HashMap<>();

    public LoginResponseDTO login(LoginRequestDTO request) {
        LoginResponseDTO dto = new LoginResponseDTO();
        try {
        
            UsuarioConfig.Usuario usuario = usuarioConfig.getUsuarios().stream()
                .filter(u -> u.getUsername().equals(request.getUsername()))
                .findFirst()
                .orElse(null);

            if (usuario == null || !encoder.matches(request.getPassword(), usuario.getPassword())) {
                dto.setSuccess(false);
                dto.setError("Usuario o password incorrectos.");
                return dto;
            }

            // Autentica con FNET3
            log.info("Login con terminal: {} usuario: {}", fnetSerial, request.getUsername());
            SynchroAndLoginRequest soap = new SynchroAndLoginRequest();
            soap.setSerialNumber(fnetSerial);
            soap.setUsername(fnetUsername);
            soap.setPassword(fnetPassword);
            soap.setForeignID(0L);

            String sid = fnetConnection.getPort().synchroAndLogin(soap).getSessionID();
            sesiones.put(usuario.getUsername(), sid);
            log.info("Login exitoso. Usuario: {} SessionID: {}", request.getUsername(), sid);

            // Genera el token JWT
            String token = jwtService.generarToken(usuario.getUsername());

            dto.setSuccess(true);
            dto.setSessionID(sid);
            dto.setUsername(usuario.getUsername());
            dto.setToken(token); 

        } catch (Exception e) {
            log.error("Error en login: {}", e.getMessage());
            dto.setSuccess(false);
            dto.setError("Error al conectar con FNET3: " + e.getMessage());
        }
        return dto;
    }

    public String getSession(String token) throws Exception {
        if (token == null) throw new Exception("Token no encontrado.");
        String username = jwtService.obtenerUsername(token);
        String sid = sesiones.get(username);
        if (sid == null) {
            throw new Exception("No hay sesion activa. Por favor inicie sesion.");
        }
        return sid;
    }

    public String getUsuarioActivo(String token) {
        return jwtService.obtenerUsername(token);
    }

    public void logout(String token) {
        String username = jwtService.obtenerUsername(token);
        sesiones.remove(username);
        log.info("Sesion cerrada. Usuario: {}", username);
    }
}