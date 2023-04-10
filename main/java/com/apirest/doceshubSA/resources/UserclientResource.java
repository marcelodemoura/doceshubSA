package com.apirest.doceshubSA.resources;

import com.apirest.doceshubSA.entity.UserClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserclientResource {
    @GetMapping
    public ResponseEntity<UserClient> findAll() {
        UserClient u = new UserClient(1L, "joao jose", "doces&cia", "joaojose@hotmail.com", "999507791");
        return ResponseEntity.ok().body(u);

    }
}
