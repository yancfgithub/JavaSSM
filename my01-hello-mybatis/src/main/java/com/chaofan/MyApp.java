package com.chaofan;


import com.chaofan.pojo.Student;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;
import java.util.List;

/**
 * @author yan
 * @create 2021 - 05 - 25 22:50
 */
public class MyApp {

    public static void main(String[] args) {
        String conf = "mybatis-conf.xml";
        InputStream in = MyApp.class.getClassLoader().getResourceAsStream(conf);
        //这种方式也可以
//        InputStream resourceAsStream = Resources.getResourceAsStream(conf);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(in);
        SqlSession sqlSession = sessionFactory.openSession();
        String statement = "com.chaofan.dao.StudentDao.selectStudents";
        List<Student> students = sqlSession.selectList(statement);
        students.forEach(stu -> System.out.println(stu));
        sqlSession.close();
    }
}
