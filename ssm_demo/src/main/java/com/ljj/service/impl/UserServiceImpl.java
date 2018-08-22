package com.ljj.service.impl;

import com.ljj.dto.User;
import com.ljj.mapper.UserMapper;
import com.ljj.service.UserService;
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

    @Override
    public boolean isExists(String username,String password) {
        User user = new User();
        user.setUsername(username);
        user.setPassword(password);
        User user1 = userMapper.find(user);
        if(user1!=null){
            return true;
        }
        return false;
    }
}
