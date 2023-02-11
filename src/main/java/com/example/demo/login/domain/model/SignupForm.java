package com.example.demo.login.domain.model;

import lombok.Data;

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
//    @NotBlank(groups = ValidGroup1.class)
//    @Email(groups = ValidGroup2.class)
    private String userId;

    /**
     * パスワード
     */
    // 必須入力、長さ4から100桁まで、半角英数字のみ
//    @NotBlank(groups = ValidGroup1.class)
//    @Length(min = 4, max = 100, groups = ValidGroup2.class)
//    @Pattern(regexp = "^[a-zA-Z0-9]+$", groups = ValidGroup3.class)
    private String password;

    /**
     * ユーザー名
     */
    //必須入力
//    @NotBlank(groups = ValidGroup1.class)
    private String userName;

    /**
     * 誕生日
     */
    // ポイント :@DateTimeFormat
    // 必須入力
//    @NotNull(groups = ValidGroup1.class)
//    @DateTimeFormat(pattern = "yyyy/MM/dd")
    private Date birthday;
}
