package com.example.demoexample.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/indexController")
public class IndexController{
    @GetMapping("/index")
    public String showIndex(){
        return "index";
    }
}