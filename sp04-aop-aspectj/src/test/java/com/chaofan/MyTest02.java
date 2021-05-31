package com.chaofan;

import com.chaofan02.SomeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 30 13:43
 */
public class MyTest02 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan01/applicationContext.xml");
        SomeService mySomeService = (SomeService) context.getBean("mySomeService02");
        mySomeService.doOther("test01");
    }
}
