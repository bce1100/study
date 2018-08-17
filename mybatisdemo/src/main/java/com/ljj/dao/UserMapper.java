package com.ljj.dao;

import com.ljj.entity.User;

import java.util.List;

/**
 * @author bce1100
 * @date 2018/8/16.
 */
public interface UserMapper {
    public User findUserById(int id) throws Exception;
    public List<User> findAll();
}
