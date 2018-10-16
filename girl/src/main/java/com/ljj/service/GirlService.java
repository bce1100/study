package com.ljj.service;

import com.ljj.domain.Girl;
import com.ljj.enums.ResultEnum;
import com.ljj.exception.GirlException;
import com.ljj.repository.GirlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;

/**
 * @author bce1100
 * @date 2018/10/16.
 */
@Service
public class GirlService {
    @Autowired
    private GirlRepository girlRepository;

    public void getAge(Integer id) throws Exception {
        Girl girl =girlRepository.findOne(id);
        Integer age = girl.getAge();
        if(age < 10){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }else if(age>10&&age<20){
            throw new GirlException(ResultEnum.MIDDLE_SCHOOL);
        }else{
            throw new GirlException(ResultEnum.SUCCESS);
        }
    }

    public Girl getOne(Integer id){
        return girlRepository.findOne(id);
    }
}
