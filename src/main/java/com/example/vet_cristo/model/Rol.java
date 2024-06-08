package com.example.vet_cristo.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;


@Setter
@Getter
@Document(collection = "rol")
public class Rol {

    @Id
    private String id;
    private String name;
    //private List<String> permissions;

}
