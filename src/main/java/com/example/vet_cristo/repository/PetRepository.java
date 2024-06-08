package com.example.vet_cristo.repository;

import com.example.vet_cristo.model.Pet;
import com.example.vet_cristo.model.Users;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;


public interface PetRepository extends MongoRepository<Pet, String> {

    @Query("{ 'userId' : ?0 }")
    List<Pet> findPetsByUserId(String userId);
}
