package com.tothefor.resultdemo.result;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Author DragonOne
 * @Date 2023/3/17 14:54
 * @墨水记忆 www.tothefor.com
 */

@AllArgsConstructor
public enum BizErrors implements BizError{
    SUCCESS_CODE(200,"成功"),
    FAIL_CODE(1000,"失败"),
    NOT(444,"异常"),
    ;

    @Override
    public Integer code() {
        return code;
    }

    @Override
    public String message() {
        return message;
    }

    Integer code;
    String message;
}
