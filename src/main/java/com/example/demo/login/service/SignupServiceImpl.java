package com.example.demo.login.service;

import com.example.demo.login.domain.model.SignupAddParam;
import com.example.demo.login.domain.model.SignupForm;
import com.example.demo.login.domain.repository.SignupRepository;
import com.example.demo.utils.CopyPropertiesUtils;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignupServiceImpl implements SignupService {

    private final SignupRepository signupRepository;

    public void add(SignupForm form) {

        SignupAddParam param = new SignupAddParam();
        CopyPropertiesUtils.copyProperties(param, form);

        signupRepository.add(param);
    }
}
