package com.pruebaTecnica.porvenir.jpa.repository;
import com.pruebaTecnica.porvenir.jpa.entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {
	
	Users findByName(String name);
}
