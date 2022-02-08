package com.s355504.androidserverbackend.service.imp;

import com.s355504.androidserverbackend.entity.User;
import com.s355504.androidserverbackend.mapper.LoginMapper;
import com.s355504.androidserverbackend.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;

    @Override
    public User getUserLoginInfo(String username,String password) {

//        User user=new User();
//
//        user.setUsername(username);
//        user.setPassword(password);

       User checkLoginInfo= loginMapper.getUserLoginInfo(username, password);

        return checkLoginInfo ;


    }

    @Override
    public List<User> getAllUserInfo() {
        return loginMapper.getALlUserInfo();
    }
}
