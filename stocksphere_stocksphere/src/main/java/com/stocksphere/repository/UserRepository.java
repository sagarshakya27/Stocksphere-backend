package com.stocksphere.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.stocksphere.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

}