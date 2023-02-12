package com.example.demo.login.domain.model;

import com.example.demo.validated.ValidGroup1;
import com.example.demo.validated.ValidGroup2;
import com.example.demo.validated.ValidGroup3;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.Data;
import org.hibernate.validator.constraints.Length;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * ユーザー新規登録フォームクラス
 */
@Data
public class SignupForm {

    /**
     * ユーザーID
     */
    // 必須入力、メールアドレス形式
    @NotBlank(message = "{require_check}", groups = ValidGroup1.class)
    @Email(message = "{email_check}", groups = ValidGroup2.class)
    private String userId;

    /**
     * パスワード
     */
    // 必須入力、長さ4から100桁まで、半角英数字のみ
    @NotBlank(message = "{require_check}", groups = ValidGroup1.class)
    @Length(min = 4, max = 100, message = "{length_check}", groups = ValidGroup2.class)
    @Pattern(regexp = "^[a-zA-Z0-9]+$", message = "{pattern1_check}", groups = ValidGroup3.class)
    private String password;

    /**
     * ユーザー名
     */
    //必須入力
    @NotBlank(message = "{require_check}", groups = ValidGroup1.class)
    private String userName;

    /**
     * 誕生日
     */
    // ポイント :@DateTimeFormat
    // 必須入力
    @NotNull(message = "{require_check}", groups = ValidGroup1.class)
    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;
}
