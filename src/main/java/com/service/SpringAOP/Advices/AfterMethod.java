//package com.service.SpringAOP.Advices;
//
//import org.springframework.aop.AfterReturningAdvice;
//import org.springframework.stereotype.Component;
//
//import java.lang.reflect.Method;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 15:09
// */
//
///**
// * 在 bean 配置文件(applicationContext.xml)，创建一个 bean 的 AfterMethod 类，并命名为“customerServiceProxyAfterMethod” 作为一个新的代理对象。
// * ‘target’ – 定义你想拦截的bean。
// * ‘interceptorNames’ – 定义要应用这个代理/目标对象的类(通知)。
// *
// *
// * /**
// * 【返回后通知】
// * 该方法返回一个结果之后它将执行。创建一个实现AfterReturningAdvice接口的类。
// */
//public class AfterMethod implements AfterReturningAdvice {
//    @Override
//    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
//        System.out.println("AfterMethod : After method !");
//    }
//}
