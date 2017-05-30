package com.lisk.framework.demo.service.impl;

import com.lisk.framework.demo.domain.User;
import com.lisk.framework.demo.mapper.UserMapper;
import com.lisk.framework.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by zuoch on 2017/5/30.
 */
@Service("userService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> findAll() {
        return userMapper.findAll();
    }

    public void insertUser(){
        User u= new User();
        u.setUsername("1");
        userMapper.insertUser(u);
//        int res=9/0;
        User u2=new User();
        u2.setUsername("2");
        userMapper.insertUser(u2);
    }

    public User findById(Long id) {
        return userMapper.findById(id);
    }

}
