package com.chaofan;

import com.chaofan.dao.StudentDao;
import com.chaofan.pojo.Student;
import com.chaofan.service.StudentService;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 30 16:25
 */
public class MyTest {

    @Test
    public void test01() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        StudentDao studentService = (StudentDao) context.getBean("studentDao");
        StudentService studentService = (StudentService) context.getBean("studentService");
        Student student = new Student();
        student.setName("老王");
        student.setEmail("laowang@126.com");
        student.setAge(32);
        Integer integer = studentService.insertStudent(student);
        System.out.println(integer);
    }

    @Test
    public void test02() {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        StudentService studentService = (StudentService) context.getBean("studentService");
        List<Student> students = studentService.selectStudents();
        students.forEach(student-> System.out.println(student));
    }
}
