package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserToSaveDto;

import java.util.Optional;

public interface UserService {
    UserDto saveUser(UserToSaveDto userToSaveDto);

    UserDto findById(Long id);

    //UserDto loginByEmail();
}
