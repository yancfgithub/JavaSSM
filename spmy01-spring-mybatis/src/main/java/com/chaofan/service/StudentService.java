package com.chaofan.service;

import com.chaofan.pojo.Student;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 30 15:50
 */
public interface StudentService {

    public Integer insertStudent(Student student);

    public List<Student> selectStudents();
}
