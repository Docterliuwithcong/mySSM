package com.jxau.service;

import com.jxau.model.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface UserService {
    List<User> selectAll();
}
