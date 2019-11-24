package com.example.resolver;

import com.example.exception.MyException;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception e) {
        MyException me;
        if(e instanceof MyException) {
            me = (MyException)e;
        } else {
            me = new MyException("你没有权限...");
        }

        ModelAndView mav = new ModelAndView("error");
        mav.addObject("errorMsg", me.getMessage());
        return mav;
    }
}
