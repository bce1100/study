package com.ljj.handle;

import com.ljj.domain.Result;
import com.ljj.exception.GirlException;
import com.ljj.utils.ResultUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author bce1100
 * @date 2018/10/16.
 */
@ControllerAdvice
public class ExceptionHandle {

    private static final Logger LOGGER = LoggerFactory.getLogger(ExceptionHandle.class);

    @ExceptionHandler(value = Exception.class)
    @ResponseBody
    public Result handle(Exception e){
        if(e instanceof GirlException){
            GirlException girlException = (GirlException) e;
            return ResultUtil.error(girlException.getCode(),girlException.getMessage());
        }else{
            LOGGER.error("[系统异常]{}",e);
            return ResultUtil.error(-1,"未知错误");
        }
    }
}
