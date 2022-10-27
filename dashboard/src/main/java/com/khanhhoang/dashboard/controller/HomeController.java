package com.khanhhoang.dashboard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @GetMapping
    public String showHomePage(){
        return "home";
    }

    @GetMapping("/admin")
    public String showControlPanelIndex(){
        return "admin/index";
    }
}
