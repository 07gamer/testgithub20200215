package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
 * @SpringBootApplication 这个注解用来标记一个主程序类，说明这是一个SpringBoot应用
 */
@SpringBootApplication
public class HelloWordMainApplication {
    public static void main(String[] args) {

        //启动SpringBoot主程序，参数一个是类名，一个是args
        SpringApplication.run(HelloWordMainApplication.class,args);
    }
}
