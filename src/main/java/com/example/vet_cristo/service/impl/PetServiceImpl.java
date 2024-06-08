package com.example.vet_cristo.service.impl;
import com.example.vet_cristo.model.Pet;
import com.example.vet_cristo.model.Rol;
import com.example.vet_cristo.repository.PetRepository;
import com.example.vet_cristo.repository.RolRepository;
import com.example.vet_cristo.repository.PetRepository;
import com.example.vet_cristo.repository.UserRepository;
import com.example.vet_cristo.service.PetService;
import com.example.vet_cristo.service.PetService;
import com.example.vet_cristo.service.dto.PetRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class PetServiceImpl implements PetService {

    @Autowired
    private PetRepository petRepository;

    @Autowired
    private UserRepository userRepository;
    

    @Override
    public List<Pet> getAllPet() {
        return petRepository.findAll();
    }

    @Override
    public Pet createPet(PetRequest petRequest) {

        Pet newPet = new Pet();
        newPet.setName(petRequest.getName());
        newPet.setSpecies(petRequest.getSpecies());
        newPet.setBreed(petRequest.getBreed());
        newPet.setAge(petRequest.getAge());
        newPet.setGender(petRequest.getGender());
        newPet.setColor(petRequest.getColor());
        newPet.setUserId(petRequest.getUserId());

        return petRepository.save(newPet);
    }

    @Override
    public Pet updatePet(String id, Pet pet) {
        Optional<Pet> existingPetsOptional = petRepository.findById(id);
        if (pet != null && existingPetsOptional.isPresent()) {
            Pet existingPets = existingPetsOptional.get();
            existingPets.setName(pet.getName());
            existingPets.setSpecies(pet.getSpecies());
            existingPets.setBreed(pet.getBreed());
            existingPets.setAge(pet.getAge());
            existingPets.setGender(pet.getGender());
            existingPets.setColor(pet.getColor());
            return petRepository.save(existingPets);
        }
        else {
            throw new RuntimeException("Pets no encontrado con ID: " + id);
        }
    }

    @Override
    public void deletePet(String id) {
        Optional<Pet> existingPetsOptional = petRepository.findById(id);
        if (existingPetsOptional.isPresent()) {
            petRepository.deleteById(id);
        }
    }

    @Override
    public Optional<Pet> getPetById(String id) {
        return petRepository.findById(id);
    }

    @Override
    public List<Pet> getPetsByUserId(String userId) {
        return petRepository.findPetsByUserId(userId);
    }
}
