package com.s355504.androidserverbackend.service;


import com.s355504.androidserverbackend.entity.User;
import org.springframework.stereotype.Service;

import java.util.List;


public interface LoginService {
    //    拿到登录用户名和密码数据
    public User getUserLoginInfo(String username,String password);

    List<User> getAllUserInfo();
}
