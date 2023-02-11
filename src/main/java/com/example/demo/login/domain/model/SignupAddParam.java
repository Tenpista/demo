package com.example.demo.login.domain.model;

import lombok.Data;

import java.util.Date;

/**
 * ユーザー新規登録用パラメータークラス
 */
@Data
public class SignupAddParam {

    /**
     * ユーザーID
     */
    private String userId;
    /**
     * パスワード
     */
    private String password;
    /**
     * ユーザー名
     */
    private String userName;
    /**
     * 誕生日
     */
    private Date birthday;
}
