package com.service.HelloSpring.impl;

import com.service.HelloSpring.HelloWorld;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 11:41
 */
//@Component("springHelloWorldImpl")
public class SpringHelloWorldImpl implements HelloWorld {
//    @Value("I am springHelloWorldImpl")
    public String name;

    @Override
    public void sayHello() {
        System.out.println("SpringHelloWorldImpl Say Hello!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}