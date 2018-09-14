package com.ljj.service.impl;

import com.ljj.dto.User;
import com.ljj.mapper.UserMapper;
import com.ljj.service.UserService;
import com.ljj.util.Md5;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
@Service
public class UserServiceImpl implements UserService{
    @Autowired
    UserMapper userMapper;
    User user;

    @Override
    public boolean checkUser(String username) {
        if(userMapper.isExists(username)>0){
            return true;
        }
        return false;
    }


    @Override
    public User login(String username, String password) {
        user.setUsername(username);
        user.setPassword(Md5.getMD5(password));
        user = userMapper.checkUser(user);
        if(user != null){
            return user;
        }
        return null;
    }

//    @Override
//    public boolean userLogin(String username,String password) {
//        user.setUsername(username);
//        user.setPassword(password);
//        User user1 = userMapper.checkUser(user);
//        if(user1!=null){
//            return true;
//        }
//        return false;
//    }
}
