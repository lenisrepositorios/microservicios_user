package com.example.demo.services;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserMapper;
import com.example.demo.dto.UserToSaveDto;
import com.example.demo.models.User;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService{
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Autowired
    public UserServiceImp(UserRepository userRepository, UserMapper userMapper){
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public UserDto saveUser(UserToSaveDto userToSaveDto) {
        User user = userMapper.saveDtoToEntity(userToSaveDto);
        User userSaved = userRepository.save(user);
        return userMapper.toDto(userSaved);
    }

    @Override
    public UserDto findById(Long id) {
         User user = userRepository.findById(id).orElseThrow();
         return userMapper.toDto(user);
    }

    /*@Override
    public UserDto loginByEmail() {
        User user = userRepository.findByEmail();
    }*/
}
