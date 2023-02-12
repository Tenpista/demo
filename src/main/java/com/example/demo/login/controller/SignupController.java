package com.example.demo.login.controller;

import com.example.demo.constant.RequestMethod;
import com.example.demo.constant.RequestValue;
import com.example.demo.login.domain.model.SignupForm;
import com.example.demo.login.domain.service.SignupService;
import com.example.demo.validated.GroupOrder;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * ユーザー新規登録画面コントローラークラス
 */
@Controller
@RequestMapping(value = RequestValue.SIGNUP)
@RequiredArgsConstructor
public class SignupController {

    /**
     * ユーザー新規登録サービスクラス
     */
    private final SignupService signupService;

    /**
     * 初期表示
     * @param model model
     * @param form form
     * @return ログイン画面
     */
    @GetMapping(value = RequestValue.INIT)
    public String init(Model model, @ModelAttribute SignupForm form) {

        // ユーザー新規登録画面表示
        return RequestValue.LOGIN + RequestValue.SIGNUP;
    };

    /**
     * 新規登録
     * @param model model
     * @param form form
     * @return ログイン画面
     */
    @PostMapping(value = RequestValue.ADD)
    public String add(@ModelAttribute @Validated(GroupOrder.class) SignupForm form,
                      BindingResult bindingResult, Model model) {

        if (bindingResult.hasErrors()){
            return RequestValue.LOGIN + RequestValue.SIGNUP;
        }

        // 登録できなかった場合ユーザー新規登録でエラー表示
        if (signupService.add(form) == 0){
            return RequestValue.LOGIN + RequestValue.SIGNUP;
        }

        // ログイン画面表示
        return RequestMethod.FORWARD + RequestValue.LOGIN + RequestValue.INIT;
    }
}
