package com.s355504.androidserverbackend.mapper;


import com.s355504.androidserverbackend.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


@Mapper
public interface LoginMapper {

    //    拿到登录用户名和密码数据
    public User getUserLoginInfo(String username,String password);

    List<User> getALlUserInfo();
}
