package com.crudestudo.rest.controller;

import com.crudestudo.rest.entity.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @GetMapping("/")
    public String home() {
        return "API REST de usuários em execução.";
    }

    @GetMapping("/users")
    public List<User> listUsers() {
        return List.of(
                new User(1L, "Luan Cabral", "luan@email.com"),
                new User(2L, "Maria Silva", "maria@email.com"),
                new User(3L, "João Souza", "joao@email.com")
        );
    }
}
