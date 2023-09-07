package com.spring.RestApi.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public class UserDto {
    public UserDto(Long id, String firstName, String lastName, String email) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    private Long id;
    @NotEmpty(message="User's First Name Can't be Empty/Null")
    private String firstName;
    @NotEmpty(message="User's Last Name Can't be Empty/Null")
    private String lastName;
    @NotEmpty(message="User's Email Can't be Empty/Null")
    @Email(message="Invalid email provided!")
    private String email;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
