package com.service.SpringEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 14:02
 */

/**
* 要在注解使用使用SpEL，必须通过注解注册您的组件。如果注册bean在XML和Java类中定义@Value，该@Value将无法执行。
 * 在注解模式下，可以使用@Value定义Spring EL。在这种情况下，一个String和Integer值直接注入到“itemBean”，之后又注入“itemBean”到“customerBean”属性。
* */
@Component("customerBean")
public class Customer {
    @Value("#{itemBean}")
    private Item item;
    @Value("#{itemBean.name}")
    private String itemName;

    @Value("#{addressBean}")
    private Address address;

    @Value("#{addressBean.country}")
    private String country;

    @Value("#{addressBean.getFullAddress('yiibai')}")//Spring表达式语言(使用SpEL)允许开发人员使用表达式来执行方法和将返回值以注入的方式到属性，或叫作“使用SpEL方法调用”。
    private String fullAddress;

    @Value("#{testBean.map['MapA']}")//使用Spring EL从 Map 和 List 中获得值。事实上，使用SpEL与 Map 和 List 的工作方式与Java是完全一样的。
    private String mapA;

    @Value("#{testBean.list[0]}")//使用Spring EL从 Map 和 List 中获得值。事实上，使用SpEL与 Map 和 List 的工作方式与Java是完全一样的。
    private String list;

    @Value("#{1 == 1}") //Spring EL支持大多数标准的数学，逻辑和关系运算符。
    private boolean testEqual;

    @Value("#{itemBean.qty < 100 ? true : false}")//Spring EL支持三元运算符，执行“if then else”条件检查。
    private boolean warning;

    @Value("#{'100' matches '\\d+' }")//Spring EL支持正则表达式，可使用一个简单的关键词“matches”。
    private boolean validDigit;




    @Override
    public String toString() {
        return "Customer [address=" + address + "\n, country=" + country
                + "\n, fullAddress=" + fullAddress + "]";
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    public boolean isTestEqual() {
        return testEqual;
    }

    public void setTestEqual(boolean testEqual) {
        this.testEqual = testEqual;
    }

    public String getMapA() {
        return mapA;
    }

    public void setMapA(String mapA) {
        this.mapA = mapA;
    }

    public String getList() {
        return list;
    }

    public void setList(String list) {
        this.list = list;
    }

    public boolean isWarning() {
        return warning;
    }

    public void setWarning(boolean warning) {
        this.warning = warning;
    }

    public boolean isValidDigit() {
        return validDigit;
    }

    public void setValidDigit(boolean validDigit) {
        this.validDigit = validDigit;
    }
}
