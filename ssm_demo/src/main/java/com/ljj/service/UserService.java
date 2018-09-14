package com.ljj.service;

import com.ljj.dto.User;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
public interface UserService {
    /**
     * 检查用户是否存在
     * @param username
     * @return
     */
    public boolean checkUser(String username);

    /**
     * 登陆
     * @param username
     * @param password
     * @return
     */
    public User login(String username,String password);


}
