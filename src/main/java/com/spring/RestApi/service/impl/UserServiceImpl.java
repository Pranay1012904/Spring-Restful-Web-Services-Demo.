package com.spring.RestApi.service.impl;

import com.spring.RestApi.dto.UserDto;
import com.spring.RestApi.entity.UserEntity;
import com.spring.RestApi.exception.EmailExistsException;
import com.spring.RestApi.exception.ResourceNotFoundException;
import com.spring.RestApi.mapper.UserMapper;
import com.spring.RestApi.repository.UserRepository;
import com.spring.RestApi.service.UserService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@AllArgsConstructor
public class UserServiceImpl implements UserService {
    UserRepository userRepository;
    public UserDto createUser(UserDto userDto){
       Optional<UserEntity> userEntity=userRepository.findByEmail(userDto.getEmail());
       if(userEntity.isPresent()){
            throw new EmailExistsException(String.format("Email %s already exists!",userDto.getEmail()));
       }
       UserEntity user = UserMapper.userDtoToUser(userDto);
       UserEntity savedUser = userRepository.save(user);
       return UserMapper.userToUserDto(savedUser);
    }

    public UserDto getUserById(Long id){
        UserEntity fetchedUser=userRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("User","ID",id));
        return UserMapper.userToUserDto(fetchedUser);
    }
}
