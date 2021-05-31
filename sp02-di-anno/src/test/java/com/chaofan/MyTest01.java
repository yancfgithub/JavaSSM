package com.chaofan;

import com.chaofan01.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 29 0:21
 */
public class MyTest01 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan01/applicationContext.xml");
        Student myStudent = (Student) context.getBean("myStudent");
        System.out.println(myStudent);
    }
}
