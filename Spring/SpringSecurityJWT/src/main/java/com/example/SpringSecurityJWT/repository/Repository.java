package com.example.SpringSecurityJWT.repository;

import com.example.SpringSecurityJWT.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface Repository extends JpaRepository<User , Integer> {

    Optional<User> findByEmail(String email);

}
