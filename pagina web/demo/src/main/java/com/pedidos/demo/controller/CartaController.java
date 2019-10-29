package com.pedidos.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartaController{
    @RequestMapping("/carta")
    public String showHello(Model model){
        model.addAttribute("Menu", "Mi primera aplicacion web Spring Boot");
        return "carta.html";
    }
}