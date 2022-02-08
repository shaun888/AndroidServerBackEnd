package com.s355504.androidserverbackend.service.imp;

import com.s355504.androidserverbackend.entity.User;
import com.s355504.androidserverbackend.mapper.RegistMapper;
import com.s355504.androidserverbackend.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class RegistServiceImpl implements RegistService {
    @Autowired
    RegistMapper registMapper;
    @Override
    public boolean registAccount(String username, String password) {
        if(username==""||password==""){
            return false;
        }
        User user=registMapper.getUsernameInfo(username);
        if (user!=null){
            return false;
        }

        int value=registMapper.registAccount(username,password);
        if (value>0){
            return true;
        }


     return false;
    }
}
