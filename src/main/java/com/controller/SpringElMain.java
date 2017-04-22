package com.controller;

import com.service.SpringEL.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.awt.AppContext;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 14:06
 */

/**
 *通过debug断点观察customer的值
 * 要在注解使用使用SpEL，必须通过注解注册您的组件。如果注册bean在XML和Java类中定义@Value，该@Value将无法执行。
 * */
public class SpringElMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        Customer customer = (Customer)context.getBean("customerBean");
        System.out.println(customer);

    }
}
