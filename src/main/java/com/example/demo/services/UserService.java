package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserToSaveDto;

public interface UserService {
    UserDto saveUser(UserToSaveDto userToSaveDto);

    UserDto findById();

    UserDto findByEmail();
}
