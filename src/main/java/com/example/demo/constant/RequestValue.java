package com.example.demo.constant;

/**
 * リクエスト値定数クラス
 */
public class RequestValue {

    /**
     * インスタンスの生成を明示的に禁止できる
     * static変数を格納するクラスはインスタンス生成不用（余計なメモリも食わない）
     */
    private RequestValue(){};


    public static final String LOGIN = "/login";
    public static final String SIGNUP = "/signup";

    public static final String INIT = "/init";
    public static final String ADD = "/add";
}
