package com.nile.fshiro.system.service;

import com.nile.fshiro.system.domain.User;

public interface UserService {

    User findByName(String name);

}
