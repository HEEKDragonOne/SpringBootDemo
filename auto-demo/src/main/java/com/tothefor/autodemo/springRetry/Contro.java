package com.tothefor.autodemo.springRetry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author DragonOne
 * @Date 2023/3/26 22:51
 * @墨水记忆 www.tothefor.com
 */

@RestController
public class Contro {

    @Autowired
    private Service service;

    @RequestMapping("/reTry")
    public Object retry(){
        service.showMsg();
        System.out.println("ok");
        return "ok";
    }

}
