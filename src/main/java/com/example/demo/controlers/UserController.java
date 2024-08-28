package com.example.demo.controlers;

import com.example.demo.dto.UserDto;
import com.example.demo.dto.UserToSaveDto;
import com.example.demo.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity<UserDto> saveUser(@RequestBody UserToSaveDto userToSaveDto){
        UserDto userDto = userService.saveUser(userToSaveDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(userDto);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> findById(@PathVariable Long id){
        try {
            UserDto userDto = userService.findById(id);
            return ResponseEntity.ok(userDto);
        } catch (Exception e) {
            return ResponseEntity.status(404).body(null);
        }
    }
}
