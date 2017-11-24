package com.guuyoog.configuration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author Guy
 * @create 2017/11/24  14:52
 **/
@SpringBootApplication
@ComponentScan(basePackages = "com.guuyoog")
public class Entry {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Entry.class, args);
    }

}
