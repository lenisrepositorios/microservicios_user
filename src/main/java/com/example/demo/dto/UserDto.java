package com.example.demo.dto;

public record UserDto(
         Long id,

         String username,
         String password,
         String email) {
}
