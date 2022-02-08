package com.s355504.androidserverbackend.mapper;


import com.s355504.androidserverbackend.entity.User;
import org.apache.ibatis.annotations.Mapper;


@Mapper
public interface RegistMapper {

//    注册账号

    public int registAccount(String username,String password);

    User getUsernameInfo(String username);
}
