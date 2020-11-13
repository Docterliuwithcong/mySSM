package com.jxau.controller;

import com.jaxu.mapper.UserMapper;
import com.jxau.model.User;
import com.jxau.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/")
public class TestController {
    @Autowired
    private UserService userService;

    @RequestMapping("/test")
    public String test(){
        List<User> userList = userService.selectAll();
        for (User user : userList){
            System.out.println(user);
        }
        return test();
    }
    }


