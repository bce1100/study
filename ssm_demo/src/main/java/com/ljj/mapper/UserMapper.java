package com.ljj.mapper;

import com.ljj.dto.User;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
public interface UserMapper {
    /**
     * 检查用户登陆
     * @param user
     * @return
     */
    public User checkUser(User user);

    /**
     * 根据用户名检查用户是否存在
     * @param username
     * @return
     */
    public int isExists(String username);
}
