package com.gogoinWeb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String root() {
        return "redirect:/index";
    }

    @GetMapping({"/index", "/index.html", "/index.jsp"})
    public String index() {
        return "index";
    }

    @GetMapping("/home")
    public String home() {
        return "home/home";
    }
}
