package com.service.SpringAOP.AspectJ;

import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 19:27
 */
@Component("CustomerBo")
public interface CustomerBo {
    void addCustomer();

    String addCustomerReturnValue();

    void addCustomerThrowException() throws Exception;

    void addCustomerAround(String name);
}
