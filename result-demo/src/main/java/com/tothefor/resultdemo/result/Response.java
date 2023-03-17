package com.tothefor.resultdemo.result;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tothefor.resultdemo.exception.BizErrorException;
import lombok.SneakyThrows;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.MethodParameter;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

import java.util.Objects;

/**
 * @Author DragonOne
 * @Date 2023/3/17 14:59
 * @墨水记忆 www.tothefor.com
 */

@ControllerAdvice(basePackages = "com.tothefor.resultdemo")
public class Response implements ResponseBodyAdvice<Object> {

    @Autowired
    private ObjectMapper objectMapper;

    @Override
    public boolean supports(MethodParameter returnType, Class<? extends HttpMessageConverter<?>> converterType) {
        return true;
    }

    @SneakyThrows
    @Override
    public Object beforeBodyWrite(Object body, MethodParameter returnType, MediaType selectedContentType, Class<? extends HttpMessageConverter<?>> selectedConverterType, ServerHttpRequest request, ServerHttpResponse response) {
        if (Objects.isNull(body)) {
            return R.success();
        }
        if (body instanceof String) { // String 需要特殊处理
            return objectMapper.writeValueAsString(R.success(body));
        }

        // 自定义异常类
        if (body instanceof BizErrorException) {
            BizErrorException e = (BizErrorException) body;
            return R.fail(e.getCode(), e.getMessage());
        }

        // 通用的异常处理
        if(body instanceof Exception){
            return R.fail(2_000,"未知异常");
        }

        return R.success(body);
    }
}
