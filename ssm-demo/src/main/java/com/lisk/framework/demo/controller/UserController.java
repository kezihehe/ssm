package com.lisk.framework.demo.controller;

import com.lisk.framework.demo.domain.User;
import com.lisk.framework.demo.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by zuoch on 2017/5/30.
 */
@Controller
@RequestMapping("/user")
@Api(value = "�û�����")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/list",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "��ȡ�û��б�",notes = "��ѯ�����û��б�����ҳ")
    public List<User> list(){
        return userService.findAll();
    }

    @RequestMapping(value = "/addui",method = RequestMethod.GET)
    public String addui(){
        return "add";
    }

    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    @ResponseBody
    public String hello(HttpServletRequest request){
        return "Hello";
    }


}
