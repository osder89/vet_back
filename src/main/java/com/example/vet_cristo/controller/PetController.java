package com.example.vet_cristo.controller;


import com.example.vet_cristo.model.Pet;
import com.example.vet_cristo.model.Users;
import com.example.vet_cristo.service.PetService;
import com.example.vet_cristo.service.UserService;
import com.example.vet_cristo.service.dto.PetRequest;
import com.example.vet_cristo.service.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class PetController {

    @Autowired
    private PetService petService;

    @QueryMapping
    public Optional<Pet> getPetById(@Argument String id) {
        return petService.getPetById(id);
    }
    @QueryMapping
    public List<Pet> getAllPets() {
        return petService.getAllPet();
    }

    @MutationMapping
    public Pet createPet(@Argument PetRequest petRequest) {
        return petService.createPet(petRequest);
    }

    @QueryMapping
    public List<Pet> getPetsByUserId(@Argument String userId) {
        return petService.getPetsByUserId(userId);
    }

}
