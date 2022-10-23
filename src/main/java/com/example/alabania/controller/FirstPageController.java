package com.example.alabania.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstPageController {

    @GetMapping("/first_page")
    public String getFirstPage(){
        return "first_page";
    }
}
