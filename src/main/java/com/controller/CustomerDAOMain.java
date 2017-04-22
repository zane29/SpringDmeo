package com.controller;

import com.dao.CustomerDAO;
import com.model.Customer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 14:06
 *
 * Spring JdbcTemplate+JdbcDaoSupport实例
 */
public class CustomerDAOMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("Spring-Module.xml");
//        如果不用JdbcTemplate，必须创建大量的冗余代码(创建连接，关闭连接，处理异常)中的所有DAO数据库的操作方法 - 插入，更新和删除。它的效率并不是很高，容易出错和乏味。
        Random random = new Random();
        int  cusId11 =random.nextInt(10000);
        CustomerDAO customerDAO11 = (CustomerDAO) context.getBean("customerDAO");
        Customer customer11 = new Customer(cusId11, "yiibai",29);
        customerDAO11.insert(customer11);
        System.out.println(customerDAO11.findByCustomerId(cusId11).toString());
        /**JdbcTemplate*/
        int  cusId22 =random.nextInt(10000);
        CustomerDAO customerDAO22 = (CustomerDAO) context.getBean("customerDAO2");
        Customer customer22 = new Customer(cusId22, "yiibai", 29);
        customerDAO22.insert(customer22);
        System.out.println( customerDAO22.findByCustomerId(cusId22).toString());
       /** JdbcDaoSupport*/
        int  cusId33 =random.nextInt(10000);
        CustomerDAO customerDAO333 = (CustomerDAO) context.getBean("customerDAO3");
        Customer customer33 = new Customer(cusId33, "yiibai", 29);
        customerDAO333.insert(customer33);
        System.out.println( customerDAO333.findByCustomerId(cusId33).toString());

    }
}