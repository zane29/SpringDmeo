package com.service.SpringAOP.AspectJ;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/23
 * Time: 14:13
 */
public class AspectMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Customer.xml");
        CustomerBoImpl customerBo = (CustomerBoImpl) context.getBean("CustomerBoImpl");
        customerBo.addCustomer();
        String str = customerBo.addCustomerReturnValue();
        System.out.println(str);
//        try {
//            customerBo.addCustomerThrowException();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }
}
