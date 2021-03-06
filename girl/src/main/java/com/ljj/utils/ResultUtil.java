package com.ljj.utils;

import com.ljj.domain.Result;
import org.apache.naming.factory.ResourceLinkFactory;

/**
 * @author bce1100
 * @date 2018/10/16.
 */
public class ResultUtil {
    public static Result success(Object object){
        Result result = new Result();
        result.setCode(0);
        result.setMsg("成功");
        result.setData(object);
        return result;
    }

    public static Result success(){
        return success(null);
    }

    public static Result error(Integer code,String msg){
        Result result = new Result();
        result.setCode(code);
        result.setMsg(msg);
        return result;
    }
}
