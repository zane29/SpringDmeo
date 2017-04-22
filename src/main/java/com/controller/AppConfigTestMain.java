package com.controller;

import com.common.AppConfig;
import com.service.appconfig.impl.AppConfigTestTestImpl;
import com.service.appconfig.impl.AppConfigTestTestImpl2;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 17:55
 */

/**
 *测试不在Spring-Customer.xml中配置【appConfigTestTestImpl】【appConfigTestTestImpl2】两个类，使用common中的AppConfig配置。
 *使用 AnnotationConfigApplicationContext 加载JavaConfig类
 * */
public class AppConfigTestMain {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        AppConfigTestTestImpl appConfig = (AppConfigTestTestImpl)context.getBean("appConfigTestTestImpl");
        AppConfigTestTestImpl2 appConfig2 = (AppConfigTestTestImpl2)context.getBean("appConfigTestTestImpl2");
        appConfig.appConfigTest();
        appConfig2.appConfigTest();
    }
}
