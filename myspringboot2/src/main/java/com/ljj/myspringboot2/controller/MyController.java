package com.ljj.myspringboot2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bce1100
 * @date 2018/10/10.
 */
@Controller
public class MyController {
    @RequestMapping("/out")
    @ResponseBody
    public String out(){
        return "success2";
    }
}
