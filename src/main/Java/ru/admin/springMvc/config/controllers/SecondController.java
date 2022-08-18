package ru.admin.springMvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@RequestMapping("/second")
@Controller
public class SecondController {
    @GetMapping("/exit")
    public String exitPage(){
        System.out.println("EXIT PAGE OPEN");
        return "second/exit";
    }
}
