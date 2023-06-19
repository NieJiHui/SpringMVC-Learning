package com.nie.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Akihi
 * @date 2023/6/18 4:50 PM
 */
@Controller
@RequestMapping("/h1")
public class HelloController {
    @RequestMapping
    public String mainPage(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","mainPage");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
    //真实访问地址 : 项目名/HelloController/hello
    @RequestMapping("/hello1")
    public String sayHello(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC1");
        //web-inf/jsp/hello.jsp
        return "hello";
    }

    @RequestMapping("/hello2")
    public String sayHello2(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC2");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
    @RequestMapping("/hello3")
    public String sayHello3(Model model){
        //向模型中添加属性msg与值，可以在JSP页面中取出并渲染
        model.addAttribute("msg","hello,SpringMVC3");
        //web-inf/jsp/hello.jsp
        return "hello";
    }
}
