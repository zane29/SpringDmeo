package com.service.SpringEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/22
 * Time: 14:16
 */
@Component("addressBean")
public class Address {

    @Value("GaoDeng, QiongShang")
    private String street;

    @Value("571100")
    private int postcode;

    @Value("CN")
    private String country;

    public String getFullAddress(String prefix) {

        return prefix + " : " + street + " " + postcode + " " + country;
    }



    @Override
    public String toString() {
        return "Address [street=" + street + ", postcode=" + postcode
                + ", country=" + country + "]";
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        this.postcode = postcode;
    }

    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
}
