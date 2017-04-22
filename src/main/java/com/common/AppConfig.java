package com.common;

import com.service.appconfig.impl.AppConfigTestTestImpl;
import com.service.appconfig.impl.AppConfigTestTestImpl2;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 17:05
 */

/**
 * 使用 @Configuration 注释告诉 Spring，这是核心的 Spring 配置文件，并通过 @Bean 定义 bean。
 * */

@Configuration
public class AppConfig {
    @Bean(name = "appConfigTestTestImpl")
    public AppConfigTestTestImpl appConfigTest() {
        return new AppConfigTestTestImpl();
    }

    @Bean(name = "appConfigTestTestImpl2")
    public AppConfigTestTestImpl2 appConfigTest2() {
        return new AppConfigTestTestImpl2();
    }

}
