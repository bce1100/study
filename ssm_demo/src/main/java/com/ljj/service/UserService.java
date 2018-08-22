package com.ljj.service;

import com.ljj.dto.User;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
public interface UserService {
    public boolean isExists(String username,String password);
}
