package com.example.vet_cristo.service.dto;


import lombok.*;

@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserRequest {
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
