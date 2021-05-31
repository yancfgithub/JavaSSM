package com.chaofan.dao;

import com.chaofan.pojo.Student;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 26 20:53
 */
public interface StudentDao {

    public List<Student> selectStudentAll();
}
