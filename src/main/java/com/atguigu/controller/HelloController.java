package com.atguigu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @ResponseBody   //把 hello world写给浏览器
    @RequestMapping("/hello")     //接收浏览器的 hello字符串
    public String hello(){
        return "hello world";
    }
}
