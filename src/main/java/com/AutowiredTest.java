//package com;
//
//import com.service.HelloSpring.HelloWorld;
//import com.service.HelloSpring.impl.SpringHelloWorldImpl;
//import com.service.HelloSpring.impl.StrutsHelloWorldImpl;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Service;
//
//import javax.annotation.Resource;
//
///**
// * Created with IntelliJ IDEA.
// * User: 周海明
// * Date: 2017/3/20
// * Time: 16:33
// */
//
///**
// * @Autowire 注解按照类型，即注解的字段的类型寻找该类型的实例bean，这种方式成为byType。
// * 这种方式会引发歧义，比如UserDAO整个框架可能有N多个该对象，那么Spring框架会采用一定规则寻找bean（转换为byName寻找，失败后报错）
// *  @Resource 是JDK提供的注解，默认就是按照byName的方式寻找bean，一般一个name对应一个bean，当找不到与名称匹配的bean才会按照类型装配（byType）。
// * @Qualifier("XXX") Spring的Bean注入配置注解，该注解指定注入的Bean的名称，Spring框架使用byName方式寻找合格的bean，这样就消除了byType方式产生的歧义。
// *
// * */
//
//@Component("AutowiredTest")
//public class AutowiredTest {
//    @Autowired//@Autowired将执行相关检查，以确保属性已经装配正常。当Spring无法找到匹配的Bean装配，它会抛出异常。要解决这个问题，可以通过 @Autowired 的“required”属性设置为false来禁用此检查功能。
//    @Qualifier("springHelloWorldImpl2")
//    public SpringHelloWorldImpl springHelloWorldImpl;
//    @Autowired//@Resource是JDK提供的注解，默认就是按照byName的方式寻找bean，一般一个name对应一个bean，当找不到与名称匹配的bean才会按照类型装配（byType）。
//    @Qualifier("strutsHelloWorldImpl")//可以使用 @Qualifier 自动装配一个特定的 bean，
//    public StrutsHelloWorldImpl strutsHelloWorldImpl;
//
//    public void pringName(){
//        System.out.println(springHelloWorldImpl.getName());
//    }
//    public HelloWorld getSpringHelloWorldImpl() {
//        return springHelloWorldImpl;
//    }
//
//    public void setSpringHelloWorldImpl(SpringHelloWorldImpl springHelloWorldImpl) {
//        this.springHelloWorldImpl = springHelloWorldImpl;
//    }
//
//    public StrutsHelloWorldImpl getStrutsHelloWorldImpl() {
//        return strutsHelloWorldImpl;
//    }
//
//    public void setStrutsHelloWorldImpl(StrutsHelloWorldImpl strutsHelloWorldImpl) {
//        this.strutsHelloWorldImpl = strutsHelloWorldImpl;
//    }
//}
