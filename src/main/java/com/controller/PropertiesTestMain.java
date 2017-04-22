package com.controller;

import com.PropertiesParameter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/21
 * Time: 9:06
 */
public class PropertiesTestMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
        PropertiesParameter propertiesParameter = (PropertiesParameter)context.getBean("propertiesParameter");
        System.out.println(propertiesParameter.toString());

    }
}
