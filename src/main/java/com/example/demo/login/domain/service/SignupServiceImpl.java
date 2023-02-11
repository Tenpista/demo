package com.example.demo.login.domain.service;

import com.example.demo.login.domain.model.SignupAddParam;
import com.example.demo.login.domain.model.SignupForm;
import com.example.demo.login.domain.repository.SignupRepository;
import com.example.demo.utils.CopyPropertiesUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * ユーザー新規登録サービス実装クラス
 */
@Service
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService {

    /**
     * ユーザー新規登録リポジトリクラス
     */
    private final SignupRepository signupRepository;

    /**
     * ユーザー新規登録
     * @param form form
     */
    public void add(SignupForm form) {

        SignupAddParam param = new SignupAddParam();
        // フィールド値コピー
        CopyPropertiesUtils.copyProperties(param, form);

        // ユーザー新規登録
        signupRepository.add(param);
    }
}
