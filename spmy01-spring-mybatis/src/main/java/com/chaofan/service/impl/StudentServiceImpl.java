package com.chaofan.service.impl;

import com.chaofan.dao.StudentDao;
import com.chaofan.pojo.Student;
import com.chaofan.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 30 15:53
 */
//@Service("studentService")
public class StudentServiceImpl implements StudentService {

//    @Autowired
    public StudentDao studentDao;

    public void setStudentDao(StudentDao studentDao) {
        this.studentDao = studentDao;
    }

    @Override
    public Integer insertStudent(Student student) {
        Integer integer = studentDao.insertStudent(student);
        System.out.println();
        return integer;
    }

    @Override
    public List<Student> selectStudents() {
        List<Student> students = studentDao.selectStudents();
        System.out.println();
        return students;
    }
}
