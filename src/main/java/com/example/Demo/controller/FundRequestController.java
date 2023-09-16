package com.example.Demo.controller;

import com.example.Demo.Dto.FundRequestDto;
import com.example.Demo.Service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class FundRequestController {

    @Autowired
    EmailService emailService;

    @PostMapping("/request")
    public ResponseEntity<String> IntitateFundingProcess(@RequestBody FundRequestDto fundRequest){
        try {
            emailService.sendEmail(fundRequest.getEmail());
        }catch (Exception e){
            return new ResponseEntity<>("ERROR",HttpStatus.INTERNAL_SERVER_ERROR);
        }
        return new ResponseEntity<>("Success",HttpStatus.OK);
    }
}
