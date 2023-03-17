package com.tothefor.resultdemo.exception;

import com.tothefor.resultdemo.result.BizError;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author DragonOne
 * @Date 2023/3/17 15:58
 * @墨水记忆 www.tothefor.com
 */

@EqualsAndHashCode(callSuper = true)
@Data
public class BizErrorException extends RuntimeException {

    private Integer code;
    private String message;

    public BizErrorException(BizError bizError) {
        this.code = bizError.code();
        this.message = bizError.message();
    }


}
