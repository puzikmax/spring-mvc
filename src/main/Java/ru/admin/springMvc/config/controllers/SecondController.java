package ru.admin.springMvc.config.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class SecondController {
    public String exit(){
        return "/second/exit";
    }
}
