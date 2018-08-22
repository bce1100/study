package com.ljj.controller;

import com.ljj.dto.User;
import com.ljj.mapper.UserMapper;
import com.ljj.service.UserService;
import com.ljj.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bce1100
 * @date 2018/8/21.
 */
@Controller
public class LoginController {
    @Autowired
    UserService userService;


    @RequestMapping("/test")
    @ResponseBody
    public Msg test(User user){
        String username = user.getUsername();
        String password = user.getPassword();
        System.out.println(username+":"+password);
        if(userService.isExists(username,password)){
            return Msg.success().add("user",user);
        }
        return Msg.fail();
//
//
//        if(user==null){
//
//        }
//
    }

    @RequestMapping("/login")
    public String login(User user, HttpSession session){
        session.setAttribute("session_user",user);
        return "hello";
    }


    @RequestMapping("/hello")
    @ResponseBody
    public String hey(){

        return "redirect";
    }
}
