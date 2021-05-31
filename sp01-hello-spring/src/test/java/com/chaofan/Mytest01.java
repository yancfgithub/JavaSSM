package com.chaofan;

import com.chaofan01.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 28 22:27
 */
public class Mytest01 {

    @Test
    public void test01() {
        String statement = "chaofan01/applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(statement);
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
