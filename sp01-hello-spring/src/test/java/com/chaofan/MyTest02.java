package com.chaofan;

import com.chaofan02.Student;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yan
 * @create 2021 - 05 - 28 22:57
 */
public class MyTest02 {

    @Test
    public void test01() {
        String application = "chaofan02/applicationContext.xml";
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(application);
        Student student = (Student) context.getBean("student");
        System.out.println(student);
    }
}
