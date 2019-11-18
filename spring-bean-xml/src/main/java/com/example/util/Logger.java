package com.example.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {

    public void beforeAdvice() {
        System.out.println("前置通知...");
    }

    public void afterReturningAdvice() {
        System.out.println("正常返回通知...");
    }

    public void afterThrowingAdvice() {
        System.out.println("异常通知...");
    }

    public void afterAdvice() {
        System.out.println("正常(finally)通知...");
    }

    public Object aroundAdvice(ProceedingJoinPoint pjp) {
        Object resultObj = null;
        try {
            System.out.println("环绕通知 -- before");
            resultObj = pjp.proceed(pjp.getArgs());
            System.out.println("环绕通知 -- afterReturning");
            return resultObj;
        } catch (Throwable throwable) {
            System.out.println("环绕通知 -- afterThrowing");
            throwable.printStackTrace();
        } finally {
            System.out.println("环绕通知 -- after");
        }
        return resultObj;
    }
}
