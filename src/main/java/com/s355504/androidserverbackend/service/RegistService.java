package com.s355504.androidserverbackend.service;

import org.springframework.stereotype.Service;


public interface RegistService {
    //    注册账号

    public boolean registAccount(String username,String password);
}
