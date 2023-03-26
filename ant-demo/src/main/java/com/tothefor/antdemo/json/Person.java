package com.tothefor.antdemo.json;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;
import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @Author DragonOne
 * @Date 2023/3/26 11:06
 * @墨水记忆 www.tothefor.com
 */
@Data
@Builder
public class Person {
    private String username;
    private String website;
}
