package com.example.vet_cristo.service.impl;
import com.example.vet_cristo.model.Rol;
import com.example.vet_cristo.repository.RolRepository;
import com.example.vet_cristo.service.RolService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository rolRepository;

    @Override
    public List<Rol> getAllRoles() {
        return rolRepository.findAll();
    }

    @Override
    public Rol createRol(Rol rol) {
        if (rol == null) {
            throw new IllegalArgumentException("El objeto Rol no puede ser nulo.");
        }
        return rolRepository.save(rol);
    }

    @Override
    public Rol updateRol(String id, Rol rol) {
        Optional<Rol> existingRolOptional = rolRepository.findById(id);
        if (rol != null && existingRolOptional.isPresent()) {
            Rol existingRol = existingRolOptional.get();
            existingRol.setName(rol.getName());
            //existingRol.setPermissions(rol.getPermissions());
            return rolRepository.save(existingRol);
        }
        else {
            throw new RuntimeException("Rol no encontrado con ID: " + id);
        }
    }

    @Override
    public void deleteRol(String id) {
        Optional<Rol> existingRolOptional = rolRepository.findById(id);
        if (existingRolOptional.isPresent()) {
            rolRepository.deleteById(id);
        }
    }

    @Override
    public Optional<Rol> getRolById(String id) {
        return rolRepository.findById(id);
    }
}
