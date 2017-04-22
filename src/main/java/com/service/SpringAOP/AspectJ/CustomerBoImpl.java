package com.service.SpringAOP.AspectJ;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 19:28
 */
@Component("CustomerBoImpl")
public class CustomerBoImpl implements CustomerBo {
    @Override
    public void addCustomer() {
        System.out.println("addCustomer() is running ");
    }

    @Override
    public String addCustomerReturnValue() {
        System.out.println("addCustomerReturnValue() is running ");
        return "abc";
    }

    @Override
    public void addCustomerThrowException() throws Exception {
        System.out.println("addCustomerThrowException() is running ");
        throw new Exception("Generic Error");
    }

    @Override
    public void addCustomerAround(String name) {
        System.out.println("addCustomerAround() is running, args : " + name);
    }
}
