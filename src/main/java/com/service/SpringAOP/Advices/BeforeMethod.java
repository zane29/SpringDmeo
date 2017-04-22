//package com.service.SpringAOP.Advices;
//
//import org.springframework.aop.MethodBeforeAdvice;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Method;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 15:00
// */
//
///**
// * 在 bean 配置文件(applicationContext.xml)，创建一个 bean 的 BeforeMethod 类，并命名为“customerServiceProxyBeforeMethod” 作为一个新的代理对象。
// * ‘target’ – 定义你想拦截的bean。
// * ‘interceptorNames’ – 定义要应用这个代理/目标对象的类(通知)。
// *
// *【之前通知】
// * 它将运行 BeforeMethod 的 before() 方法，在每个 CustomerService 的方法之前执行。
// */
//public class BeforeMethod implements MethodBeforeAdvice {
//    @Override
//    public void before(Method method, Object[] objects, Object o) throws Throwable {
//        System.out.println("BeforeMethod : Before method !");
//    }
//}
