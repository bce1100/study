package com.ljj.controller;

import com.ljj.domain.Result;
import com.ljj.repository.GirlRepository;
import com.ljj.domain.Girl;
import com.ljj.service.GirlService;
import com.ljj.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

/**
 * @author bce1100
 * @date 2018/10/15.
 */
@RestController
public class GirlController {
    private final static Logger LOGGER = LoggerFactory.getLogger(GirlController.class);

    @Autowired
    private GirlRepository girlRepository;

    @Autowired
    private GirlService girlService;

    @GetMapping(value = "/girls")
    public List<Girl> girlList() {
        return girlRepository.findAll();
    }

    @PostMapping(value = "/girls")
    public Result girlAdd(@Valid Girl girl, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return ResultUtil.error(1, bindingResult.getFieldError().getDefaultMessage());
        }
        girl.setCupSize(girl.getCupSize());
        girl.setAge(girl.getAge());
        return ResultUtil.success(girlRepository.save(girl));
    }

    @GetMapping(value = "/girls/getAge/{id}")
    public void  getAge(@PathVariable("id")Integer id) throws Exception {
        girlService.getAge(id);
    }
}
