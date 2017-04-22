package com.model;

import com.service.HelloSpring.HelloWorld;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/20
 * Time: 11:41
 */
@Service
@Scope("prototype")//如果想有一个新的 “CustomerService”bean 实例，每次调用它的时候，需要使用原型(prototype)来代替。还可以使用注释来定义 bean 的作用域。
public class HelloWorldService {
    public String name;
    public String school;
    public int floor;
    private HelloWorld helloWorld;

    public HelloWorldService() {

    }
    public HelloWorldService(String name,String school,int floor) {
        this.name=name;
        this.school=school;
        this.floor =floor;
    }
    public HelloWorldService(String name,int floor,String school) {
        this.name=name;
        this.school=school;
        this.floor =floor;
    }

    @Override
    public String toString() {
        return "naem:"+name+"\tschool:"+school+"\tfloor:"+floor;
    }

    public void setHelloWorld(HelloWorld helloWorld) {
        this.helloWorld = helloWorld;
    }

    public HelloWorld getHelloWorld() {
        return this.helloWorld;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }
}