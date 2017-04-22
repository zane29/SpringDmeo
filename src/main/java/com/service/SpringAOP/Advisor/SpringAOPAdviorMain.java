//package com.service.SpringAOP.Advisor;
//
//import com.service.SpringAOP.Advices.CustomerService;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 16:50
// */
//
///**
// * 在上一个Spring AOP通知的例子，一个类的整个方法被自动拦截。但在大多数情况下，可能只需要一种方式来拦截一个或两个方法，这就是为什么引入'切入点'的原因。
// * 它允许你通过它的方法名来拦截方法。另外，一个“切入点”必须具有“Advisor' 相关联。
// * 在Spring AOP中，有三个非常专业术语- Advices, Yiibaicut , Advisor，把它在非官方的方式...
// * Advice – 指示之前或方法执行后采取的行动。
// * Yiibaicut – 指明哪些方法应该拦截，通过方法的名称或正则表达式模式。
// * Advisor – 分组"通知"和”切入点“成为一个单元，并把它传递到代理工厂对象。
// */
//public class SpringAOPAdviorMain {
//    public static void main(String[] args) {
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(new String[]{"Spring-Module.xml"});
//        //再次运行它，现在得到新的 customerServiceProxy bean，而不是原来的CustomerService bean。
////        CustomerService customerService = (CustomerService) appContext.getBean("customerServiceProxy");
//        CustomerService customerService = (CustomerService) appContext.getBean("CustomerService");
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
