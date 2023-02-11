package com.example.demo.login.controller;

import com.example.demo.constant.RequestValue;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ログイン画面コントローラー
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    /**
     * ログイン画面初期表示
     * @return ログイン画面
     */
    @RequestMapping(value = RequestValue.INIT)
    public String init(){
        return RequestValue.LOGIN + RequestValue.INIT;
    }
}
