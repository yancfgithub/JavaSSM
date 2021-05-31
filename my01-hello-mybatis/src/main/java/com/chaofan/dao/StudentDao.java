package com.chaofan.dao;

import com.chaofan.pojo.Student;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 25 22:27
 */
public interface StudentDao {

    public List<Student> selectStudents();
}
