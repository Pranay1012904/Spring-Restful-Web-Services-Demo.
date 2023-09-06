package com.spring.RestApi.service.impl;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.entity.UserEntity;
import com.spring.RestApi.mapper.UserMapper;
import com.spring.RestApi.repository.UserRepository;
import com.spring.RestApi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    public UserDto createUser(UserDto userDto){
        UserEntity user=UserMapper.userDtoToUser(userDto);
        UserEntity savedUser=userRepository.save(user);
        return UserMapper.userToUserDto(savedUser);
    }
}
