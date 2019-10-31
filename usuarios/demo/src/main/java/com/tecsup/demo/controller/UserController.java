package com.tecsup.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    
    @RequestMapping("/login.html")
	public ModelAndView login() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login"); // resources/template/login.html
		return modelAndView;
	}

	@RequestMapping("/register.html")
	public ModelAndView register() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("register"); // resources/template/register.html
		return modelAndView;
	}
	
	@RequestMapping("/index.html")
	public ModelAndView index() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("index"); // resources/template/home.html
		return modelAndView;
	}
    @RequestMapping("/about.html")
    public ModelAndView about() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("about"); // resources/template/home.html
        return modelAndView;
    }
    @RequestMapping("/contact.html")
    public ModelAndView contact() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("contact"); // resources/template/home.html
        return modelAndView;    
    }
    @RequestMapping("/menu.html")
    public ModelAndView menu() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("menu"); // resources/template/home.html
		return modelAndView;
    }
    @RequestMapping("/single.html")
    public ModelAndView single() {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("single"); // resources/template/home.html
		return modelAndView;
    }
}