package com.example.demoexample.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/loginController")
public class LoginController{
    @GetMapping("/login")
    public String showLogin(){
        return "login";
    }
}