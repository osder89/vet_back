package com.example.vet_cristo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Document(collection = "users")
public class Users {

    @Id
    private String id;
    private String names;
    private String lastNames;
    private String ci;
    private String phone;
    private String address;
    private String email;
    private String password;
    private String roleId;
}
