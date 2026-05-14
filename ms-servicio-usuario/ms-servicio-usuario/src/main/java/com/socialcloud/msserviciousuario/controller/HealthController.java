package com.socialcloud.msserviciousuario.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthController {

    @GetMapping("/api/health")
    public String health() {
        return "ms-servicio-usuario funcionando correctamente";
    }
}
