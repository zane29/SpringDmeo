package com.service;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created with IntelliJ IDEA.
 * User: 周海明
 * Date: 2017/3/23
 * Time: 19:12
 */
@Controller
@RequestMapping("/hello")
public class HelloController{

    @RequestMapping(value = "/helloworld",method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        model.addAttribute("message", "Hello Spring MVC Framework!");
        return "hello";
    }

}