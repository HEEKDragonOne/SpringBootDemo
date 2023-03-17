package com.tothefor.resultdemo.result;

/**
 * 统一的一个异常错误码接口
 * @Author DragonOne
 * @Date 2023/3/17 14:48
 * @墨水记忆 www.tothefor.com
 */
public interface BizError {
    Integer code();

    String message();

    default BizError of(Integer code, String message) {
        return new BizError() {
            @Override
            public Integer code() {
                return code;
            }

            @Override
            public String message() {
                return message;
            }
        };
    }
}
