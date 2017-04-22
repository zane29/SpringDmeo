//package com.controller;
//
//import com.AutowiredTest;
//import com.service.HelloSpring.HelloWorld;
//import com.service.HelloSpring.impl.SpringHelloWorldImpl;
//import com.service.HelloSpring.impl.StrutsHelloWorldImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/20
// * Time: 19:10
// */
//public class AutowiredTestMain {
//    public static void main(String[] args) {
//
//        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//        AutowiredTest autowiredTest = (AutowiredTest)context.getBean("AutowiredTest");
//        //如果这样写可能会出现这样的错误，AutowiredTest.class定义了两个别名，会产生歧义。Exception in thread "main" org.springframework.beans.factory.NoUniqueBeanDefinitionException: No qualifying bean of type [com.AutowiredTest] is defined: expected single matching bean but found 2: autowiredTest,autowiredtest
//        SpringHelloWorldImpl springHelloWorldImpl = (SpringHelloWorldImpl) autowiredTest.getSpringHelloWorldImpl();
//        StrutsHelloWorldImpl strutsHelloWorldImpl = autowiredTest.getStrutsHelloWorldImpl();
////        System.out.println(springHelloWorldImpl.getName()+"\t\t\t"+ strutsHelloWorldImpl.getName());
//        autowiredTest.pringName();
//    }
//}
