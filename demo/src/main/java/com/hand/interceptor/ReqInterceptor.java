package com.hand.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Objects;

/**
 * @author bce1100
 * @date 2018/8/20.
 */
public class ReqInterceptor extends HandlerInterceptorAdapter {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String value = request.getHeader("LOGIN");
        if (Objects.equals(value, "TRUE")) {
            return true;
        } else {
            throw new IllegalStateException("NO LOGIN HEADER");
        }
    }
}
