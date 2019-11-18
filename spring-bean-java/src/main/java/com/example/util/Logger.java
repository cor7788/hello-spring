package com.example.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class Logger {

    @Pointcut("execution(* *..*.saveAccount(..))")
    public void pc1() {}

    @Pointcut("execution(* *..*.delAccount(..))")
    public void pc2() {}

    @Before("pc1()")
    public void beforeAdvice() {
        System.out.println("前置通知...");
    }

    @AfterReturning("pc1()")
    public void afterReturningAdvice() {
        System.out.println("正常返回通知...");
    }

    @AfterThrowing("pc1()")
    public void afterThrowingAdvice() {
        System.out.println("异常通知...");
    }

    @After("pc1()")
    public void afterAdvice() {
        System.out.println("正常(finally)通知...");
    }

    @Around("pc2()")
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
