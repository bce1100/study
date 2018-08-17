package com.ljj.test;

import com.ljj.dao.UserMapper;
import com.ljj.db.SessionFactoryUtil;
import com.ljj.entity.User;
import org.apache.ibatis.session.SqlSession;

/**
 * @author bce1100
 * @date 2018/8/10.
 */
public class Test {
    public static void main(String[] args) throws Exception {
        SqlSession session = SessionFactoryUtil.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
        User user = mapper.findUserById(1);
        System.out.println(user.getUserName()+":"+user.getPassword());
    }
}
