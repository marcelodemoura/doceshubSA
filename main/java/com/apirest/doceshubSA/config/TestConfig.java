package com.apirest.doceshubSA.config;

import com.apirest.doceshubSA.entity.UserClient;
import com.apirest.doceshubSA.repository.UserClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
    @Autowired
    private UserClientRepository userClientRepository;
    @Override
    public void run(String... args) throws Exception {
        UserClient u1 = new UserClient(null, "Maria Brown", "doces&doces", "maria@gmail.com", "123456");
        UserClient u2 = new UserClient(null, "Alex da Silva", "doces&golouseimas", "doces&golouseimas@outlook.com.br", "123456");

        userClientRepository.saveAll(Arrays.asList(u1,u2));
    }
}
