package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserMapper;
import com.example.demo.dto.UserToSaveDto;
import com.example.demo.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;


    @Override
    public UserDto saveUser(UserToSaveDto userToSaveDto) {
        return null;
    }

    @Override
    public UserDto findById() {
        return null;
    }

    @Override
    public UserDto findByEmail() {
        return null;
    }
}
