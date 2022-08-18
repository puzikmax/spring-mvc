package ru.admin.springMvc.config.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;

import javax.servlet.http.HttpServletRequest;

//@RequestMapping("/first")
@Controller
public class FirstController {
    @GetMapping("/hello")
    public String homePage(@RequestParam(value = "name", required = false) String name,
                           @RequestParam(value = "surname", required = false) String surname, Model model) {

        //System.out.println("HELLO " + name + " " + surname);
        model.addAttribute("message", "Hello, " + name + " " + surname);
        return "first/hello";
    }

    @GetMapping("/goodbye")
    public String lastPage() {
        System.out.println("TAP TO LAST PAGE");
        return "first/goodbye";
    }

    @GetMapping("/film")
    public String filmPage() {
        return "first/film";
    }

    @GetMapping("/calculator")
    public String calculator(@RequestParam("a") int a,
                             @RequestParam("b") int b,
                             @RequestParam("action") String action, Model model) {
        double result;
        switch (action) {
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / (double) b;
                break;
            case "substraction":
                result = a - b;
                break;
            case "addition":
                result = a + b;
                break;
            default:
                result=0;
        }
        model.addAttribute("result", result);

        return "first/calculator";
    }
}
