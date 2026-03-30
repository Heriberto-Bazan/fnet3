package com.pos.fnet3.fnet3;

import org.springframework.security.crypto.argon2.Argon2PasswordEncoder;

public class GenerarHashes {
    public static void main(String[] args) {
        Argon2PasswordEncoder encoder = Argon2PasswordEncoder.defaultsForSpringSecurity_v5_8();

        System.out.println("opPa$$ → " + encoder.encode("opPa$$"));
        System.out.println("1234   → " + encoder.encode("1234"));
        System.out.println("5678   → " + encoder.encode("5678"));
    }
}