package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/21
 * Time: 9:13
 */
/**
 *
 * Spring-Customer.xml配置扫包后，本类只要使用了@Service 注解就可以了。并且可以自己命名，和使用 @Value（）初始化等。
 *
 *  1.@PostConstruct说明
 *  被@PostConstruct修饰的方法会在服务器加载Servlet的时候运行，并且只会被服务器调用一次，类似于Serclet的inti()方法。被@PostConstruct修饰的方法会在构造函数之后，init()方法之前运行。
 *  2.@PreConstruct说明
 *  被@PreConstruct修饰的方法会在服务器卸载Servlet的时候运行，并且只会被服务器调用一次，类似于Servlet的destroy()方法。被@PreConstruct修饰的方法会在destroy()方法之后运行，在Servlet被彻底卸载之前。（详见下面的程序实践）
 * */
@Service("propertiesParameter")
public class PropertiesParameter {
    @Value("{driverClassName}")
    public String driverClassName;
    @Value("www.hao123.com")
    public String url;
    @Value("${username}")
    public String username;
    @Value("${password}")
    public String password;
    public int num;

    @PostConstruct//被@PostConstruct修饰的方法会在构造函数之后，init()方法之前运行。
    public void testPostConstruct() {
        System.out.println("PropertiesParameter被初始化了.加载Servlet的时候运行，并且只会被服务器调用一次");
    }

    @Override
    public String toString() {
        return driverClassName + url + username + password;
    }

    public String getDriverClassName() {
        return driverClassName;
    }

    public void setDriverClassName(String driverClassName) {
        this.driverClassName = driverClassName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
