package com.example.Demo.Dto;

import com.example.Demo.Config.PasswordMatches;
import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@PasswordMatches
public class UserDto {

    @NotBlank(message = "Email is required")
    @Size(max = 100, message = "Email must not exceed 100 characters")
    @Email(message = "Invalid email format")
    String userName;
    String password;
    String confirmPassword;
    String role;
    boolean active;
    @NotBlank(message = "phoneNumber is required")
    String phoneNumber;
    @NotBlank(message = "University name is required")
    String universityName;
    @NotBlank(message = "University Id is required")
    String universityId;
    @NotBlank(message = "Race is required")
    String race;
    boolean minority;
}
