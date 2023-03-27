package com.tothefor.autodemo.springRetry;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

/**
 * @Author DragonOne
 * @Date 2023/3/26 22:50
 * @墨水记忆 www.tothefor.com
 */

@Service
public class ServiceImpl implements com.tothefor.autodemo.springRetry.Service {

    @Autowired
    private TryMapper tryMapper;


    @Override
    public void showMsg() {
        tryMapper.show();
        System.out.println("ServiceImpl-showMsg");
    }



    @Override
    public int get() {
        tryMapper.getAll();
        System.out.println("ServiceImpl-get");
        return 0;
    }
}
