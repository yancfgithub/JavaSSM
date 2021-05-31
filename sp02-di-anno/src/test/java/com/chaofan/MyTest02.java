package com.chaofan;

import com.chaofan02.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 29 12:19
 */
public class MyTest02 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan01/applicationContext.xml");
        Student myStudent = (Student) context.getBean("myStudent2");
        System.out.println(myStudent);
    }
}
