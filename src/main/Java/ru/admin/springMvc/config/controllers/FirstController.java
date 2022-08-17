package ru.admin.springMvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/first")
@Controller
public class FirstController {
    @GetMapping("/hello")
    public String homePage(){

        return "first/hello";
    }
    @GetMapping("/good_bye")
    public String lastPage(){

        return "first/good_bye";
    }
}
