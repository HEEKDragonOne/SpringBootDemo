package com.tothefor.antdemo.json;

import com.fasterxml.jackson.annotation.JsonUnwrapped;
import lombok.Builder;
import lombok.Data;

/**
 * @Author DragonOne
 * @Date 2023/3/26 09:33
 * @墨水记忆 www.tothefor.com
 */

@Data
@Builder
public class Show {
    @JsonUnwrapped(prefix = "man-pre",suffix = "man-suf")
    private Man man;
    @JsonUnwrapped
    private Person person;
}
