package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * TODO:springboot启动类
 * springboot的入口
 *
 * @auther Administrator
 * @createdate 2021/7/22
 */
@SpringBootApplication
public class HelloController {
    public static void main(String[] args) {
        SpringApplication.run(HelloController.class,args);
    }
}
