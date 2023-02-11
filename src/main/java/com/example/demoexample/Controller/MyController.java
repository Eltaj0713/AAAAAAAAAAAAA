package com.example.demoexample.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("myController")
public class MyController {
    public String showAll(){
        return "helloMe";
    }
}