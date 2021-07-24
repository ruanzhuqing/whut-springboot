package com.whut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO:springboot入口，启动类
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@SpringBootApplication
@MapperScan("com.whut.mappers")
public class WaterApplication {
    public static void main(String[] args) {
        SpringApplication.run(WaterApplication.class,args);
    }
}
