package com.chaofan;

import com.chaofan04.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 28 23:13
 */
public class MyTest04 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan04/applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
