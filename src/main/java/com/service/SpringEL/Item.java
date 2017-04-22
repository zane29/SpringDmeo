package com.service.SpringEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 14:03
 */

/**
 * 要在注解使用使用SpEL，必须通过注解注册您的组件。如果注册bean在XML和Java类中定义@Value，该@Value将无法执行。
 * */
@Component("itemBean")
public class Item {
    @Value("item")
    private String name;
    @Value("12")
    private int qty;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
