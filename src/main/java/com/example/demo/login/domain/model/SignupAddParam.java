package com.example.demo.login.domain.model;

import lombok.Data;

import java.util.Date;

@Data
public class SignupAddParam {

    private String userId; //ユーザーID
    private String password; //パスワード
    private String userName; //ユーザー名
    private Date birthday; //誕生日
}
