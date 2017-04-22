package com.controller;

import com.service.HelloSpring.HelloWorld;
import com.model.HelloWorldService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 11:42
 */
public class HelloProgramMain {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");

        HelloWorldService service = (HelloWorldService) context.getBean("helloWorldService");
        HelloWorld hw = service.getHelloWorld();
        hw.sayHello();
        System.out.println(service.getName());

        System.out.println("********************");


    }
}