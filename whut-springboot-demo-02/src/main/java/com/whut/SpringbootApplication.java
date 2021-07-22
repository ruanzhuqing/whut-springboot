package com.whut;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO:Springboot启动器
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@SpringBootApplication
@MapperScan("com.whut.mappers")
public class SpringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootApplication.class,args);
    }

}
