package com.ljj.test;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author bce1100
 * @date 2018/8/22.
 */
@Aspect
public class TestAspectJ {
    @Before(value = "execution(* com.ljj.test.TestDao.save(..))")
    public void before(){
        System.out.println("前置通知");
    }

    @AfterReturning(value = "execution(* com.ljj.test.TestDao.save(..))",returning = "result")
    public void after(Object result){
        result = "afterretuning";
        System.out.println("后置通知 \t"+result);
    }
}
