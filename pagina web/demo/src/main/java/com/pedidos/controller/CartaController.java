package com.pedidos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class CartaController{
    @RequestMapping("/menu")
    public String showHello(Model model){
        model.addAttribute("Menu", "Mi primera aplicacion web Spring Boot");
        return "carta";
    }
}