package com.cn.zj.service;

import org.apache.dubbo.config.annotation.Service;

@Service
public class UserServiceImpl implements UserService{
    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
