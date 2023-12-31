package com.example.Demo.Config;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;

public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

    @Override
    public void onAuthenticationSuccess(
            HttpServletRequest request,
            HttpServletResponse response,
            Authentication authentication) throws IOException, ServletException {

        if(authentication.getAuthorities().stream().anyMatch(auth->"ROLE_STUDENT".equals(auth.getAuthority()))){
            response.sendRedirect("/student/home");
        }

        if(authentication.getAuthorities().stream().anyMatch(auth->"ROLE_DONATOR".equals(auth.getAuthority()))){
            response.sendRedirect("/Donator/home");
        }

    }
}

