package com.ljj.test;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class Test {

    @Autowired
    TestDao testDao;

    @org.junit.Test
    public void demo1(){
        testDao.save();
        testDao.update();
        testDao.delete();
    }
}
