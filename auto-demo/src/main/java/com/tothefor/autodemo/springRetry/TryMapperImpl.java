package com.tothefor.autodemo.springRetry;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @Author DragonOne
 * @Date 2023/3/26 22:46
 * @墨水记忆 www.tothefor.com
 */

@Service
public class TryMapperImpl implements TryMapper {

    @Retryable(value = Exception.class,maxAttempts = 3)
    @Override
    public void show() {
        System.out.println("MapperImpl-show");
        throw new RuntimeException("ServiceImpl-showMsg Err");
    }


//    @Recover
//    public void retryDou(Exception e){
//        System.out.println("ServiceImpl-失败补偿 ");
//    }

    @Override
    public int getAll() {
        System.out.println("MapperImpl-getAll");
        return 0;
    }
}
