package com.controller;

import com.model.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 19:08
 *
 * Spring-Customer.xml中配置了构造函数初始化参数。测试带参数构造函数初始化
 */
public class ConstructorInitMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        HelloWorldService service = (HelloWorldService)context.getBean("helloWorldService2");
        System.out.println( service.toString());

    }
}
