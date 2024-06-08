package com.example.vet_cristo.service;

import com.example.vet_cristo.model.Pet;
import com.example.vet_cristo.service.dto.PetRequest;

import java.util.List;
import java.util.Optional;

public interface PetService {

    List<Pet> getAllPet();

    Pet createPet(PetRequest petRequest);

    void deletePet(String id);

    Pet updatePet(String id, Pet pet);

    Optional<Pet> getPetById(String id);

    List<Pet> getPetsByUserId(String userId) ;
}
