package com.socialcloud.msserviciousuario.controller;

import com.socialcloud.msserviciousuario.dto.AuthResponse;
import com.socialcloud.msserviciousuario.dto.LoginRequest;
import com.socialcloud.msserviciousuario.dto.RegisterRequest;
import com.socialcloud.msserviciousuario.service.AuthService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    @ResponseStatus(HttpStatus.CREATED)
    public AuthResponse register(@Valid @RequestBody RegisterRequest request) {
        return authService.register(request);
    }
g
    @PostMapping("/login")
    public AuthResponse login(@Valid @RequestBody LoginRequest request) {
        return authService.login(request);
    }
}