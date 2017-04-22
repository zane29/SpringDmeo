//package com.service.SpringAOP.Advices;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 14:48
// */
//
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Spring AOP
// * 功能：简单得说，它只是一个拦截器拦截一些过程，例如，当一个方法执行，Spring AOP 可以劫持一个执行的方法，在方法执行之前或之后添加额外的功能。
// * 在Spring AOP中，有 4 种类型通知(advices)的支持：
// * 1.通知(Advice)之前 - 该方法执行前运行
// * 2.通知(Advice)返回之后 – 运行后，该方法返回一个结果
// * 3.通知(Advice)抛出之后 – 运行方法抛出异常后，
// * 4.环绕通知 – 环绕方法执行运行，结合以上这三个通知。
// * 【总结】
// * 大部分的 Spring 开发者都只是实现了“环绕通知”，因为它可以对所有通知类型，但更好的做法应该是选择最合适的通知类型来满足要求。
// * 切入点
// * 在这个例子中，在一客户服务类中的所有方法都自动拦截(通知)。但在大多数情况下，可能需要使用切入点和Advisor通过它的方法名拦截它的方法。
// */
//
//public class SpringAOPAdvicesMain {
//
//    public static void main(String[] args) {
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(
//                new String[]{"Spring-Module.xml"});
//        //再次运行它，现在得到新的 customerServiceProxy bean，而不是原来的CustomerService bean。
//        CustomerService customerService = (CustomerService) appContext.getBean("customerServiceProxy");
//        System.out.println("*************************");
//        customerService.printName();
//        System.out.println("*************************");
//        customerService.printURL();
//        System.out.println("*************************");
//        try {
//            customerService.printThrowException();
//        } catch (Exception e) {
//        }
//    }
//}
