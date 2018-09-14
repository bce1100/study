package com.ljj.controller;

import com.ljj.dto.User;
import com.ljj.mapper.UserMapper;
import com.ljj.service.UserService;
import com.ljj.util.Msg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * @author bce1100
 * @date 2018/8/21.
 */
@Controller("/user")
public class LoginController {
    @Autowired
    UserService userService;
    ModelAndView modelAndView;
    User loginUser;


//    @RequestMapping("/test")
//    @ResponseBody
//    public Msg test(User user){
//        String username = user.getUsername();
//        String password = user.getPassword();
//        System.out.println(username+":"+password);
//        if(userService.isExists(username,password)){
//            return Msg.success().add("user",user);
//        }
//        return Msg.fail("登陆失败",404);
//
//    }

//    @RequestMapping("/login")
//    @ResponseBody
//    public String a(){
//        return "aaabbb";
//    }

    @RequestMapping(value = "/login1",method = RequestMethod.POST)
    public ModelAndView checkLogin(User user,HttpSession session){
        if(!userService.checkUser(user.getUsername())){
            modelAndView.addObject("login_msg","用户不存在");
            modelAndView.setViewName("redirect:/login");
            return modelAndView;
        }
        loginUser = userService.login(user.getUsername(),user.getPassword());
        if(loginUser!=null){
            session.setAttribute("user",loginUser);
            modelAndView.addObject("user",loginUser);
            modelAndView.setViewName("list");
            return modelAndView;
        }
        modelAndView.addObject("login_msg","用户名或密码错误");
        modelAndView.setViewName("redirect:/login");
        return modelAndView;
    }

}
