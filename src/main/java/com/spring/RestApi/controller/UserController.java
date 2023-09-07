package com.spring.RestApi.controller;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.exception.ErrorDetails;
import com.spring.RestApi.exception.ResourceNotFoundException;
import com.spring.RestApi.service.UserService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.WebRequest;

import java.time.LocalDateTime;

@RestController
@RequestMapping("/user")
@AllArgsConstructor
public class UserController {
    UserService userService;
    @PostMapping("/create")
    public ResponseEntity<UserDto> createUser(@RequestBody @Valid UserDto userDto){
        UserDto savedUser=userService.createUser(userDto);
        return ResponseEntity.ok().body(savedUser);
    }
    @GetMapping("{id}")
    public ResponseEntity<UserDto> fetchUserById(@PathVariable Long id){
        UserDto fetchedUser=userService.getUserById(id);
        return ResponseEntity.ok().body(fetchedUser);
    }

}
