package com.tothefor.resultdemo.result;

import com.alibaba.fastjson.JSONObject;
import com.tothefor.resultdemo.exception.BizErrorException;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author DragonOne
 * @Date 2023/3/17 14:50
 * @墨水记忆 www.tothefor.com
 */

@RestController
public class resultTestContr {

    @RequestMapping("/ttf/result")
    public Object result() {
        int age = 23;
        String name = "www.tothefor.com";

        try {
            int i = 0;
            int j = 1 / i;
        } catch (Exception e) {
            throw new BizErrorException(BizErrors.NOT);
        }

        return new JSONObject()
                .fluentPut("age", age)
                .fluentPut("name", name)
                ;
    }

}
