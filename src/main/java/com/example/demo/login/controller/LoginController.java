package com.example.demo.login.controller;

import com.example.demo.constant.RequestValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @GetMapping(value = RequestValue.INIT)
    public String init(){
        return "/login/login";
    }
}
