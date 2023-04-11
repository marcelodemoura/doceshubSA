package com.apirest.doceshubSA.resources;

import com.apirest.doceshubSA.entity.UserClient;
import com.apirest.doceshubSA.service.UserServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/user")
public class UserClientResource {

    @Autowired
    public UserServiceClient serviceClient;
    @GetMapping
    public ResponseEntity<List<UserClient>> findAll() {
        List<UserClient> list =serviceClient.findAll();
        return ResponseEntity.ok().body(list);
    }
    @GetMapping(value = "/{id}")
    public ResponseEntity<UserClient> findById(@PathVariable Long id){
        UserClient obj = serviceClient.findById(id);
        return ResponseEntity.ok().body(obj);

    }
        @GetMapping(value = "/nome/{nome}")
    public ResponseEntity<UserClient> findByNome(@PathVariable String nome) {
            UserClient objo = serviceClient.findByNome(nome);
            return ResponseEntity.ok().body(objo);
        }
}
