package com.chaofan04;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @author yan
 * @create 2021 - 05 - 30 14:13
 */
@Component("myAspect04")
@Aspect
public class MyAspect {

    @Around(value = "execution(* com.chaofan04.impl.*.*(..))")
    public Object myAround(ProceedingJoinPoint pjp) throws Throwable {
        Object obj = null;
        System.out.println("环绕通知前"+new Date());
        Object[] args = pjp.getArgs();

        obj = pjp.proceed();
        System.out.println("环绕通知后事务");
        return obj;
    }
}
