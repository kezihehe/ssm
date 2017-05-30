package com.lisk.framework.demo.service;

import com.lisk.framework.demo.domain.User;

import java.util.List;

/**
 * Created by zuoch on 2017/5/30.
 */
public interface UserService {

    public List<User> findAll();

    public void insertUser();

    public User findById(Long id);

}
