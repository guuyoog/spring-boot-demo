package com.guuyoog.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Guy
 * @create 2017/11/24  14:52
 **/
@SpringBootApplication //扫描组件 @ComponentScan(value = "com.spriboot.controller") 配置扫描组件的路径
@ComponentScan(basePackages = "com.guuyoog")
public class Entry {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }

}
