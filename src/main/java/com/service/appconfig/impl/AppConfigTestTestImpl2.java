package com.service.appconfig.impl;

import com.service.appconfig.AppConfigTest;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 17:51
 */

/**
 * 这个类不在Spring-Customer.xml中配置，使用common中的AppConfig配置。
 * */
public class AppConfigTestTestImpl2 implements AppConfigTest {
    @Override
    public void appConfigTest() {
        System.out.println("我是AppConfigTestTestImpl2");
    }
}
