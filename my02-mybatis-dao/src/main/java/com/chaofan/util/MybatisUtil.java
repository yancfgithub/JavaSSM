package com.chaofan.util;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.InputStream;

/**
 * @author yan
 * @create 2021 - 05 - 26 20:48
 */
public class MybatisUtil {

    public static SqlSession getSqlSession() {
        String conf = "mybatis-conf.xml";
        InputStream in = MybatisUtil.class.getClassLoader().getResourceAsStream(conf);
        //这种方式也可以
//        InputStream resourceAsStream = Resources.getResourceAsStream(conf);
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        SqlSessionFactory sessionFactory = builder.build(in);
        SqlSession sqlSession = sessionFactory.openSession();
        return sqlSession;
    }
}
