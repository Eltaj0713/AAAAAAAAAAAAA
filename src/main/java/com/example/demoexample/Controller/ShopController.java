package com.example.demoexample.Controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/shopController")
public class ShopController{
    @GetMapping("/shop")
    public String showShop(){
        return "shop";
    }
}