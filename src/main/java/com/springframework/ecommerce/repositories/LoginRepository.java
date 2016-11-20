package com.springframework.ecommerce.repositories;

import com.springframework.ecommerce.domain.Login;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoginRepository extends MongoRepository<Login, String> {

    public Login findByUsername(String username);
}