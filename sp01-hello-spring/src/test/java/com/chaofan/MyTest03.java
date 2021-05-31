package com.chaofan;

import com.chaofan03.School;
import com.chaofan03.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 28 23:13
 */
public class MyTest03 {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("chaofan03/applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
