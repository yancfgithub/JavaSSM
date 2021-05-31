package com.chaofan02;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * @author yan
 * @create 2021 - 05 - 30 13:41
 */
@Component("myAspect02")
@Aspect
public class MyAspect {


    @AfterReturning(value = "execution(* com.chaofan02.impl.*.*(..))",returning = "ret")
    public void myAfterReturning(Object ret) {
        System.out.println("后置通知....");
        System.out.println("返回值为:" + ret);
    }
}
