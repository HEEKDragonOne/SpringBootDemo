package com.tothefor.resultdemo.result;

import lombok.Builder;
import lombok.Data;

/**
 * @Author DragonOne
 * @Date 2023/3/17 14:41
 * @墨水记忆 www.tothefor.com
 */

@Data
@Builder
public class R<T> {
    private Boolean success;
    private Integer code;
    private String message;
    private T data;

    public static <T> R<T> success() {
        return success(null);
    }

    /**
     * 成功请求
     *
     * @param data
     * @param <T>
     * @return
     */
    public static <T> R<T> success(T data) {
        return R.<T>builder()
                .success(true)
                .code(200)
                .message("成功")
                .data(data)
                .build();
    }

    public static <T> R<T> fail() {
        return fail(1_000, "请求失败");
    }

    /**
     * 失败请求
     *
     * @param code
     * @param message
     * @param <T>
     * @return
     */
    public static <T> R<T> fail(Integer code, String message) {
        return R.<T>builder()
                .success(false)
                .code(code)
                .message(message)
                .data(null)
                .build();
    }

    public static <T> R<T> fail(BizError bizError) {
        return R.<T>builder()
                .success(false)
                .code(bizError.code())
                .message(bizError.message())
                .data(null)
                .build();
    }

}
