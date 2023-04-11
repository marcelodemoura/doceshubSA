package com.apirest.doceshubSA.repository;

import com.apirest.doceshubSA.entity.UserClient;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserClientRepository extends JpaRepository<UserClient, Long> {

    public Optional<UserClient> findByNome(String nome);
}

