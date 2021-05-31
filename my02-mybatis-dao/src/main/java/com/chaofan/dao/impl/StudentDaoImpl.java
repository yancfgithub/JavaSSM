package com.chaofan.dao.impl;

import com.chaofan.dao.StudentDao;
import com.chaofan.pojo.Student;
import com.chaofan.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 26 20:57
 */
public class StudentDaoImpl implements StudentDao {

    String url = "com.chaofan.dao.StudentDao.";

    @Override
    public List<Student> selectStudentAll() {

        String statement = url + "selectStudentAll";

        SqlSession sqlSession = MybatisUtil.getSqlSession();
        List<Student> students = sqlSession.selectList(statement);

        sqlSession.close();
        return students;
    }
}
