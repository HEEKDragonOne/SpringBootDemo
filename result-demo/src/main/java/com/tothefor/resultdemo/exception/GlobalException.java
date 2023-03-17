package com.tothefor.resultdemo.exception;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Author DragonOne
 * @Date 2023/3/17 16:00
 * @墨水记忆 www.tothefor.com
 */

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(BizErrorException.class)
    public BizErrorException exception(BizErrorException e) {
        System.out.println("自定义异常类");
        return e;
    }

    @ExceptionHandler(Exception.class)
    public Exception exception(Exception e){
        System.out.println("通用异常类");
        return e;
    }

}
