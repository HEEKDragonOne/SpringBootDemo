package com.tothefor.antdemo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DragonOne
 * @Date 2023/3/15 14:47
 * @墨水记忆 www.tothefor.com
 */
@RestController
public class AntController {
    /**
     * ant:
     * ？：单个字符，匹配任意一个字符
     * *：0多个字符，任意0或多个字符
     * **：0或多级目录
     */

    @RequestMapping("/ttf/test?")
    public Object testA(){
        return "ant-?";
    }

    @RequestMapping("/ttf/test*")
    public Object testB(){
        return "ant-*";
    }

    @RequestMapping("/**/test")
    public Object testC(){
        return "ant-**";
    }

}
