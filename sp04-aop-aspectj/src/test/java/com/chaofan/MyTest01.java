package com.chaofan;

import com.chaofan01.SomeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 30 2:00
 */
public class MyTest01 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan01/applicationContext.xml");
        SomeService mySomeService = (SomeService) context.getBean("mySomeService");
        mySomeService.doSome("张三",23);
    }
}
