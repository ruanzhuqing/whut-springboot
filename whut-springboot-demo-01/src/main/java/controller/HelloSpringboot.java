package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * TODO:实现输出hello springboot的控制器
 * 被@RestController注解修饰的类在程序启动的时候会注入到SpringBoot容器中，表示这个类充当Controller(控制器)，它
 * 里面定义的方法全部以Json字符串的形式返回给浏览器
 * @auther Administrator
 * @createdate 2021/7/22
 */
@RestController
public class HelloSpringboot {
    /**
     * @GetMapping将HTTP GET请求映射到特定的方法。例如：将浏览器的/hello请求映射到hello()方法
     * @return
     */
    @GetMapping("/hello")
    public String hello(){
        return "Hello Springboot";
    }
}
