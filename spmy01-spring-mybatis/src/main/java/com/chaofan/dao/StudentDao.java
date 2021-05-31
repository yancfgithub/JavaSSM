package com.chaofan.dao;

import com.chaofan.pojo.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 30 15:40
 */
public interface StudentDao {

    //添加
    public Integer insertStudent(Student student);

    //查询全部
    public List<Student> selectStudents();
}
