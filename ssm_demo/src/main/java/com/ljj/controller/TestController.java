package com.ljj.controller;

import com.ljj.dto.Goods;
import com.ljj.dto.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;

/**
 * @author bce1100
 * @date 2018/8/21.
 */
@Controller
@RequestMapping("/user")
public class TestController {

    @RequestMapping("/hello")
    public String toViews(){
        return "hello";
    }

    @RequestMapping("/index")
    public String toIndex(){
        return "redirect:/index.jsp";
    }

    @RequestMapping("/addGoods")
    public ModelAndView addGoods(Goods goods){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject(goods);
        modelAndView.setViewName("redirect:/hello");
        return modelAndView;
    }


}
