package com.jxau.service.impl;

import com.jaxu.mapper.UserMapper;
import com.jxau.model.User;
import com.jxau.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        List<User> userList = userMapper.selectAll();
        return userList;
    }
}
