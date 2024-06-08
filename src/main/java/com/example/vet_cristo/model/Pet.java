package com.example.vet_cristo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Setter
@Getter
@Document(collection = "pets")
public class Pet {

    @Id
    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private String color;
    private String userId;
}
