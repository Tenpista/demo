package com.example.demo.login.controller;

import com.example.demo.constant.RequestMethod;
import com.example.demo.constant.RequestValue;
import com.example.demo.login.domain.model.SignupForm;
import com.example.demo.login.service.SignupService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = RequestValue.SIGNUP)
@RequiredArgsConstructor
public class SignupController {

    private final SignupService signupService;

    @GetMapping(value = RequestValue.INIT)
    public String init(Model model, @ModelAttribute SignupForm form) {

        return RequestValue.LOGIN + RequestValue.SIGNUP;
    };

    @PostMapping(value = RequestValue.ADD)
    public String add(Model model, @ModelAttribute SignupForm form) {

        signupService.add(form);

        return RequestMethod.FORWARD + RequestValue.LOGIN + RequestValue.INIT;
    }
}
