package com.tothefor.retrydemo;

import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @Author DragonOne
 * @Date 2023/3/27 13:43
 * @墨水记忆 www.tothefor.com
 */

@Service
public class DemoServiceImpl implements DemoService {

    @Retryable(value = Exception.class, maxAttempts = 4, backoff = @Backoff(delay = 2000, multiplier = 2))
    @Override
    public void message() {
        System.out.println("MapperImpl-message " + new Date());
        throw new RuntimeException("message Error");
    }

    @Recover
    public void messageTry(Exception e){
        System.out.println("MapperImpl-messageTry " + new Date());

    }

    @Recover
    public Integer getAllTry(RuntimeException e){
        System.out.println("MapperImpl-getAllTry " + new Date());
        return 2;
    }

    @Recover
    public Integer getAll22222Try(Exception e,int code){
        System.out.println("MapperImpl-getAll22222Try " + new Date());
        return 4;
    }

    @Retryable(recover = "getAll22222Try",value = RuntimeException.class, maxAttempts = 4, backoff = @Backoff(delay = 2000, multiplier = 2))
    @Override
    public Integer getAll(int code) {
        System.out.println("MapperImpl-getAll " + new Date());
        if (true) {
            throw new RuntimeException("getAll Error");
        }
        return 1;
    }
}
