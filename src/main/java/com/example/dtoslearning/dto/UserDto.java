package com.example.dtoslearning.dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDto {
    private long userId;
    private String firstName;
    private String lastName;
    private String email;
}
