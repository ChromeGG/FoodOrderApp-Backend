package com.company.foodorderapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/api")
@Controller
public class TestController {

    @GetMapping("/test")
    @ResponseBody
    public String home() {
        return "test123";
    }
}
