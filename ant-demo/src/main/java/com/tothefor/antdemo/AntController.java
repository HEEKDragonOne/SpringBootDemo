package com.tothefor.antdemo;

import com.alibaba.fastjson.JSONObject;
import com.tothefor.antdemo.json.Man;
import com.tothefor.antdemo.json.Person;
import com.tothefor.antdemo.json.Show;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletResponse;
import java.util.Date;

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
    public Object testA() {
        return "ant-?";
    }

    @RequestMapping("/ttf/test*")
    public Object testB() {
        return "ant-*";
    }

    @RequestMapping("/**/test")
    public Object testC() {
        return "ant-**";
    }

    @RequestMapping("/cook")
    public Object cook(HttpServletResponse response) {
        // 创建一个 cookie
        Cookie cookie = new Cookie("username", "www.tothefor.com");
        //设置 cookie过期时间
        cookie.setMaxAge(7 * 24 * 60 * 60);
        //添加到 response 中
        response.addCookie(cookie);
        return "ok";
    }

    @RequestMapping("/get/cook")
    public Object getCook(@CookieValue(value = "username", defaultValue = "Atta") String cook) {

        return "Get 到的" + cook;
    }

    @RequestMapping("/get/json")
    public Show getJson() {
        return Show.builder()
                .man(Man.builder()
                        .username("man-name")
                        .website("man-website").build())
                .person(Person.builder()
                        .username("person-name")
                        .website("person-website")
                        .build())
                .build()
                ;
    }

}
