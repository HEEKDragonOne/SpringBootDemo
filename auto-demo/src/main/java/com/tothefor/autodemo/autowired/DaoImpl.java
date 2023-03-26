package com.tothefor.autodemo.autowired;

import org.springframework.stereotype.Service;

/**
 * @Author DragonOne
 * @Date 2023/3/26 11:36
 * @墨水记忆 www.tothefor.com
 */
@Service("mapperImpl")
public class DaoImpl implements Dao{
    @Override
    public void show() {
        System.out.println("DaoImpl 实现类");
    }
}
