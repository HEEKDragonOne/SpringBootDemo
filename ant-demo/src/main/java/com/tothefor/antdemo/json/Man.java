package com.tothefor.antdemo.json;

import lombok.Builder;
import lombok.Data;

/**
 * @Author DragonOne
 * @Date 2023/3/26 09:31
 * @墨水记忆 www.tothefor.com
 */

@Data
@Builder
public class Man {
    private String username;
    private String website;
}
