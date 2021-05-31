package com.chaofan01;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author yan
 * @create 2021 - 05 - 30 1:57
 */
@Component("myAspect")
@Aspect
public class MyAspect {

    @Before(value = "execution(public void com.chaofan01.SomeServiceImpl.doSome(String,Integer))")
    public void getDate() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String format = sdf.format(new Date());
        System.out.println("现在的时间是:" + format);
    }
}
