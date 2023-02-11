package com.example.demo.login.domain.repository;

import com.example.demo.login.domain.model.SignupAddParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * ユーザー新規登録リポジトリクラス
 */
@Mapper
public interface SignupRepository {

    /**
     * ユーザー新規登録
     * @param param ユーザー新規登録用パラメータークラス
     * @return 登録件数
     */
    int add(SignupAddParam param);
}
