package com.example.vet_cristo.service.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PetRequest {

    private String id;
    private String name;
    private String species;
    private String breed;
    private int age;
    private String gender;
    private String color;
    private String userId;

}
