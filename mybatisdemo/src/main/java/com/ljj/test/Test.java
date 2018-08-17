package com.ljj.test;

import com.ljj.dao.UserMapper;
import com.ljj.db.SessionFactoryUtil;
import com.ljj.entity.User;
import org.apache.ibatis.session.SqlSession;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/8/10.
 */
public class Test {
    public static void main(String[] args) throws Exception {
/*        SqlSession session = SessionFactoryUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);*/
        ApplicationContext applicationContext =new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = applicationContext.getBean(UserMapper.class);
        List<User> uList = userMapper.findAll();
        for(User u:uList){
            System.out.println(u.getId()+"->"+u.getUserName()+":"+u.getPassword());
        }
    }
}
