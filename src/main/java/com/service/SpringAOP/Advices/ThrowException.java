//package com.service.SpringAOP.Advices;
//
//import org.springframework.aop.ThrowsAdvice;
//import org.springframework.stereotype.Component;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 15:18
// */
//
///**
// * 【抛出后通知】
// * 它将在执行方法抛出一个异常后。创建一个实现ThrowsAdvice接口的类，并创建一个afterThrowing方法拦截抛出：IllegalArgumentException异常。
// * */
//public class ThrowException implements ThrowsAdvice {
//    public void afterThrowing(IllegalArgumentException e) throws Throwable {
//        System.out.println("ThrowException : Throw exception !");
//    }
//}
