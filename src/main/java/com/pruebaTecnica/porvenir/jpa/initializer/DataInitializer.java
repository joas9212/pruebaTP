package com.pruebaTecnica.porvenir.jpa.initializer;

import com.pruebaTecnica.porvenir.jpa.repository.UsersRepository;
import com.pruebaTecnica.porvenir.jpa.entity.Users;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import jakarta.annotation.PostConstruct;

@Component
public class DataInitializer {

    @Autowired
    private UsersRepository userRepository;

    @PostConstruct
    public void init() {
        Users user = new Users();
        user.setId(1l);
        user.setName("por12584");
        user.setPassword("prueba1");

        userRepository.save(user);
    }
}
