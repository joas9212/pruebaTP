package com.pruebaTecnica.porvenir.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.pruebaTecnica.porvenir.jpa.entity.Users;
import com.pruebaTecnica.porvenir.jpa.repository.UsersRepository;

@RestController
@CrossOrigin(origins = "*")
public class ServicesController {

	@Autowired
    private UsersRepository usersRepository;
	
	@GetMapping("/login")
	public ResponseEntity<Object>  login(@RequestParam String name , @RequestParam String password) {
		Users user = usersRepository.findByName(name);
		if (user != null && user.getPassword().equals(password)) {
			return ResponseEntity.ok().body(Map.of("message", "Inicio de sesión exitoso"));
        } else {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(Map.of("message", "Error en el inicio de sesión"));
        }
    }
}
