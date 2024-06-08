package com.example.vet_cristo.controller;


import com.example.vet_cristo.model.Rol;
import com.example.vet_cristo.model.Users;
import com.example.vet_cristo.service.RolService;
import com.example.vet_cristo.service.UserService;
import com.example.vet_cristo.service.dto.RolRequest;
import com.example.vet_cristo.service.dto.UserRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;
import java.util.Optional;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @QueryMapping
    public Optional<Users> getUserById(@Argument String id) {

        return userService.getUserById(id);
    }
    @QueryMapping
    public List<Users> getAllUsers() {
        return userService.getAllUsers();
    }

    @MutationMapping
    public Users createUser(@Argument UserRequest userRequest) {
        return userService.createUser(userRequest);
    }

}
