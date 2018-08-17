package com.ljj.db;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.Reader;

/**
 * @author bce1100
 * @date 2018/8/10.
 */
public class SessionFactoryUtil {
    private static SqlSessionFactory sessionFactory;
    private SessionFactoryUtil(){}
    public static synchronized SqlSession getSession(){
        Reader reader;
        try {
            reader = Resources.getResourceAsReader("mybatis-config.xml");
            if(sessionFactory==null){
                sessionFactory = new SqlSessionFactoryBuilder().build(reader);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sessionFactory.openSession();
    }
}
