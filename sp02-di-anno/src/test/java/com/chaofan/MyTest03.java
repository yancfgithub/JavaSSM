package com.chaofan;

import com.chaofan03.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 29 12:33
 */
public class MyTest03 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan01/applicationContext.xml");
        Student myStudent03 = (Student) context.getBean("myStudent03");
        System.out.println(myStudent03);
    }
}
