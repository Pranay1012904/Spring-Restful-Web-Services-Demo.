package com.spring.RestApi.controller;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
