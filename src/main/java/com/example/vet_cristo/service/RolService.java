package com.example.vet_cristo.service;

import com.example.vet_cristo.model.Rol;

import java.util.List;
import java.util.Optional;

public interface RolService {
    List<Rol> getAllRoles();

    Rol createRol(Rol rol);

    void deleteRol(String id);

    Rol updateRol(String id, Rol rol);

    Optional<Rol> getRolById(String id);
}
