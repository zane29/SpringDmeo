//package com.service.SpringAOP;
//
//import com.service.SpringAOP.AspectJ.CustomerBo;
//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/22
// * Time: 17:49
// */
///*
//* 使用customerAdvisor2不知道为什么不成功
//* customerAdvisor 可以。
//*
//* */
//public class AutoProxy {
//    public static void main(String[] args) {
//        ApplicationContext appContext = new ClassPathXmlApplicationContext(
//                new String[]{"Spring-Module.xml"});
//        //再次运行它，现在得到新的 customerServiceProxy bean，而不是原来的CustomerService bean。
//        CustomerBo customerBo = (CustomerBo) appContext.getBean("CustomerBoImpl");
////        CustomerService customerService = (CustomerService) appContext.getBean("customerService");
//        System.out.println("*************************");
//        customerBo.addCustomer();
//    }
//}
