package com.chaofan;

import com.chaofan04.SomeService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 30 14:17
 */
public class MyTest04 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan01/applicationContext.xml");
        SomeService mySomeService04 = (SomeService) context.getBean("mySomeService04");
        String obj = mySomeService04.doFirst("zhangsan", 23);
        System.out.println(obj);
    }
}
