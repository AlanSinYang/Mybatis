package com.kuang.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

//SqlSessionFactory
public class MybatisUtils {
    private static SqlSessionFactory sqlSessionFactory;
    static {
        try {
            //使用Mybatis获取SqlSessionFactory对象
            String resource = "mybatis-config.xml";
            InputStream inputStream = Resources.getResourceAsStream(resource);
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    //既然您已经有了一个SqlSessionFactory，顾名思义，您就可以获取SqlSession的一 个实例了。
    // SqlSession包含对数据库执行SQL命令所需的所有方法。
    //您可以直接对SqlSession实例执行映射的SQL语句。
    public static SqlSession getSqlSession(){

        return sqlSessionFactory.openSession(true);
    }
}
