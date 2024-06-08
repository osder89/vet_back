package com.example.vet_cristo.repository;

import com.example.vet_cristo.model.Rol;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface RolRepository extends MongoRepository<Rol, String> {

}
