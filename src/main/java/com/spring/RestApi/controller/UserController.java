package com.spring.RestApi.controller;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    UserService userService;
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody UserDto userDto){
        UserDto savedUser=userService.createUser(userDto);
        return ResponseEntity.ok().body(savedUser);
    }
    @GetMapping("{id}")
    public ResponseEntity<UserDto> fetchUserById(@PathVariable Long id){
        UserDto fetchedUser=userService.getUserById(id);
        return ResponseEntity.ok().body(fetchedUser);
    }
}
