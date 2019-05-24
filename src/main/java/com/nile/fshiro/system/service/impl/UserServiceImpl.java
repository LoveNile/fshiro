package com.nile.fshiro.system.service.impl;

import com.nile.fshiro.system.dao.UserMapper;
import com.nile.fshiro.system.domain.User;
import com.nile.fshiro.system.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User findByName(String name) {
        List<User> list = userMapper.findUserByName(name);
        return list.isEmpty() ? null : list.get(0);
    }
}
