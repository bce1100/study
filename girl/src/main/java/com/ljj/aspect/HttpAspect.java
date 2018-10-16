package com.ljj.aspect;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import sun.rmi.runtime.Log;

import javax.servlet.http.HttpServletRequest;

/**
 * @author bce1100
 * @date 2018/10/16.
 */
@Aspect
@Component
public class HttpAspect {

    private final static Logger LOGGER = LoggerFactory.getLogger(HttpAspect.class);

    @Pointcut("execution(public * com.ljj.controller.GirlController.*(..))")
    public void log(){
    }

    @Before("log()")
    public void doBefore(JoinPoint joinpoint){
        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
        HttpServletRequest request = attributes.getRequest();

        //url
        LOGGER.info("url={}",request.getRequestURL());

        //method
        LOGGER.info("method={}",request.getMethod());

        //ip
        LOGGER.info("ip={}",request.getRemoteAddr());

        //类方法
        LOGGER.info("class_method={}",joinpoint.getSignature().getDeclaringTypeName() + "." + joinpoint.getSignature().getName());

        //参数
        LOGGER.info("args={}",joinpoint.getArgs());
    }

    @After("log()")
    public void doAfter(){
        LOGGER.info("2222doafter");
    }

    @AfterReturning(returning = "object",pointcut = "log()")
    public void doAfterReturning(Object object){
        LOGGER.info("response={}",object.toString());
    }
}
