package com.liu.controller;

import com.liu.entity.UserInfo;
import com.liu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {
    @Autowired
    private UserService userService;
    @RequestMapping("/sayHello")
    @ResponseBody
    public  String sayHello(){
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername("xiaoming");
        userInfo.setPassword("123456");
        userService.addUser(userInfo);
       return "hello";
    }

}
