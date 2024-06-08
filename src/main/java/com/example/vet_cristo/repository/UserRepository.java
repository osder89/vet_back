package com.example.vet_cristo.repository;

import com.example.vet_cristo.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface UserRepository extends MongoRepository<Users, String> {

}
