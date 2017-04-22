//package com.service.SpringAOP.Advices;
//
//
//import org.aopalliance.intercept.MethodInterceptor;
//import org.aopalliance.intercept.MethodInvocation;
//import org.springframework.stereotype.Component;
//
//import java.util.Arrays;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 15:34
// */
//
///**
// * 它结合了上面的三个通知，在方法执行过程中执行。创建一个实现了MethodInterceptor接口的类。
// * 必须调用“methodInvocation.proceed();” 继续在原来的方法执行，否则原来的方法将不会执行。
// */
//public class AroundMethod implements MethodInterceptor {
//    @Override
//    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
////        System.out.println("Method name : " + methodInvocation.getMethod().getName());
////        System.out.println("Method arguments : " + Arrays.toString(methodInvocation.getArguments()));
//        // same with MethodBeforeAdvice
//        System.out.println("AroundMethod : Before method !");
//        try {
//            // proceed to original method call
//            Object result = methodInvocation.proceed();
//            // same with AfterReturningAdvice
//            System.out.println("AroundMethod : After method  !");
//            return result;
//        } catch (IllegalArgumentException e) {
//            // same with ThrowsAdvice
//            System.out.println("AroundMethod : Throw exception !");
//            throw e;
//        }
//    }
//}
