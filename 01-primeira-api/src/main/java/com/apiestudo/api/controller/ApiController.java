package com.apiestudo.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/api")
public class ApiController {

    @GetMapping("/hello")
    public Map<String, String> hello() {
        return Map.of("message", "Olá! Esta é minha primeira API com Spring Boot.");
    }

    @GetMapping("/status")
    public Map<String, String> status() {
        return Map.of(
                "status", "online",
                "project", "springboot-studies"
        );
    }
}
