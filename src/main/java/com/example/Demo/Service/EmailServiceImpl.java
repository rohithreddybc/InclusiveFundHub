package com.example.Demo.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailServiceImpl implements EmailService {

    @Autowired
    private JavaMailSender emailSender;

    @Override
    public void sendEmail(String to) {
            String text="HI waup";
            SimpleMailMessage message = new SimpleMailMessage();
            String subject ="HEy welcome !!";
            message.setTo(to);
            message.setSubject(subject);
            message.setText(text);

            emailSender.send(message);
        }

}
