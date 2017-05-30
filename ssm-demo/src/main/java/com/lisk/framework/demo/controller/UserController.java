package com.lisk.framework.demo.controller;

import com.lisk.framework.demo.domain.User;
import com.lisk.framework.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zuoch on 2017/5/30.
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/list")
    @ResponseBody
    public List<User> list(){
        return userService.findAll();
    }

    @RequestMapping("/addui")
    public String addui(){
        return "add";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(HttpServletRequest request){
        return "Hello";
    }


}
