package com.tecsup.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
public class UserController {
    
    @RequestMapping("/index.html")
    public String index(){
        return "index";
    }
    @RequestMapping("/login.html")
    public String login(){
        return "login";
    }
    @RequestMapping("/register.html")
    public String register(){
        return "register";
    }
    @RequestMapping("/about.html")
    public String about(){
        return "about";
    }
    @RequestMapping("/contact.html")
    public String contact(){
        return "contact";
    }
    @RequestMapping("/menu.html")
    public String menu(){
        return "menu";
    }
    @RequestMapping("/single.html")
    public String single(){
        return "single";
    }
}