package com.example.demo.login.domain.repository;

import com.example.demo.login.domain.model.SignupAddParam;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Mapper
public interface SignupRepository {

    int add(SignupAddParam param);
}
