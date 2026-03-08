package com.PruthvirajPawar1.quizapp.controller;

import com.PruthvirajPawar1.quizapp.model.LoginRequest;
import com.PruthvirajPawar1.quizapp.model.User;
import com.PruthvirajPawar1.quizapp.security.JwtUtil;
import com.PruthvirajPawar1.quizapp.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @Autowired
    UserService userService;


    LoginRequest loginRequest;

    @Autowired
    JwtUtil jwtUtil;

    @PostMapping("/register")
    public User register(@RequestBody User user){
        return userService.saveUser(user);
    }

    @PostMapping("/login")
    public String login(@RequestBody LoginRequest request)
    {

        User user = userService.findByUsername(request.getUsername());

        if(user != null && user.getPassword().equals(request.getPassword()))
        {
            return jwtUtil.generateToken(request.getUsername());
        }

        return "Invalid username or password";
    }
}
