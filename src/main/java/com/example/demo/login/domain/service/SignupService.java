package com.example.demo.login.domain.service;

import com.example.demo.login.domain.model.SignupForm;

/**
 * ユーザー新規登録サービスインターフェース
 */
public interface SignupService {

    /**
     * ユーザー新規登録
     * @param form form
     */
    void add(SignupForm form);
}
