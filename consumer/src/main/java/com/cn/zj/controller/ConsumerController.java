package com.cn.zj.controller;

import com.cn.zj.service.UserService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Reference
    UserService userService;
    @GetMapping("/hello")
    public String getName(String name){
        return userService.sayHello(name);
    }
}
