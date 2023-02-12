package com.example.demo.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * ログAOPクラス
 */
@Aspect
@Component
public class LogAspect {

    /**
     * コントローラークラスのメソッド実行前後にログ出力
     * @param jp joinPoint (実行タイミング)
     * @return メソッド実行結果
     * @throws Throwable e
     */
    @Around("bean(*Controller)")
    public Object aroundLog(ProceedingJoinPoint jp) throws Throwable {

        System.out.println("メソッド開始：" + jp.getSignature());

        try {
            Object result = jp.proceed();

            System.out.println("メソッド終了：" + jp.getSignature());

            return result;
        } catch (Exception e) {
            System.out.println("メソッド異常終了：" + jp.getSignature());
            e.printStackTrace();
            throw e;
        }
    }
}
