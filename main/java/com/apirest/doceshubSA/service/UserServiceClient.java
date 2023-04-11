package com.apirest.doceshubSA.service;

import com.apirest.doceshubSA.entity.UserClient;
import com.apirest.doceshubSA.repository.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceClient {
    @Autowired
    private UserClientRepository repository;
    public List<UserClient> findAll(){
        return repository.findAll();
    }
    public UserClient findById(Long id ){
        Optional <UserClient> obj = repository.findById(id);
        return obj.get();
    }
    public UserClient findByNome(String nome){
        Optional<UserClient> objo = repository.findByNome(nome);
        return objo.get();

    }

}
