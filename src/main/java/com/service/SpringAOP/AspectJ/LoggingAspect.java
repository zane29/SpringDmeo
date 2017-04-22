package com.service.SpringAOP.AspectJ;

import org.aopalliance.intercept.MethodInvocation;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 19:31
 */
@Component("LoggingAspect")
@Aspect
public class LoggingAspect {
    @Pointcut("execution(* com.service.SpringAOP.AspectJ.CustomerBo*.*(..))")
    public void pointCut() {
    }

    @Before("execution(* com.service.SpringAOP.AspectJ.CustomerBo.addCustomer(..))")
    public void logBefore(JoinPoint pjp) {
        System.out.println("logBefore() is running!");
        System.out.println("方法名 : " + pjp.getSignature().getName());
        System.out.println("******");
    }

    @After("execution(*  com.service.SpringAOP.AspectJ.CustomerBo.addCustomer(..))")
    public void logAfter(JoinPoint pjp) {
        System.out.println("logAfter() is running!");
        System.out.println("方法名 : " + pjp.getSignature().getName());
        System.out.println("******");
    }

    //    logAfterReturning()方法将在 customerBo 接口的addCustomerReturnValue()方法执行之后执行。此外，还可以截取返回的值使用“returning”属性。
    @AfterReturning(pointcut = "execution(* com.service.SpringAOP.AspectJ.CustomerBo.addCustomerReturnValue(..))", returning = "result")
    public void logAfterReturning(JoinPoint pjp,Object result) {
        System.out.println("logAfterReturning() is running!");
        System.out.println("方法名 : " + pjp.getSignature().getName());
        System.out.println("******");
    }
//    如果 customerBo 接口的addCustomerThrowException()方法抛出异常logAfterThrowing()方法将被执行。
    @AfterThrowing(pointcut = "execution(* com.service.SpringAOP.AspectJ.CustomerBo.addCustomerThrowException(..))", throwing= "error")
    public void logAfterThrowing(JoinPoint pjp, Throwable error) {
        System.out.println("logAfterThrowing() is running!");
        System.out.println("方法名 : " + pjp.getSignature().getName());
        System.out.println("Exception : " + error);
        System.out.println("******");
    }

    @Around("execution(* com.service.SpringAOP.AspectJ.CustomerBo.addCustomerAround(..))")
    public void around(ProceedingJoinPoint pjp) throws Throwable {
        System.out.println("around start..");
        System.out.println("方法名 : " + pjp.getSignature().getName());
        try {
            pjp.proceed();
        } catch (Throwable ex) {
            System.out.println("error in around");
            throw ex;
        }
        System.out.println("around end");
    }
}
