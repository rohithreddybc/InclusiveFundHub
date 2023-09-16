package com.example.Demo.controller;

import com.example.Demo.Dto.UserDto;
import com.example.Demo.Service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @PostMapping("/create")
    public ResponseEntity<String> createAccount(@Valid @RequestBody UserDto userDto){
         String result= userService.createAccount(userDto);

        ResponseEntity<String> responseEntity = new ResponseEntity<>(result, result.equals("Success")?HttpStatus.OK:HttpStatus.INTERNAL_SERVER_ERROR);

        return responseEntity;

    }




}
