package com.s355504.androidserverbackend.controller;


import com.s355504.androidserverbackend.entity.User;
import com.s355504.androidserverbackend.service.LoginService;
import com.s355504.androidserverbackend.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class LoginController {
    @Autowired
    LoginService loginService;
    @Autowired
    RegistService registService;

    int i=1;

    @RequestMapping("/userLogin")
    public Map<String,Object> getLoginInfo(String username, String password){
        Map<String,Object> map=new HashMap<>();
        String usernameData=null;
        String usernamePassword=null;

        User user=loginService.getUserLoginInfo(username,password);
        if (user!=null){

//            usernameData=user.getUsername();
//
//            usernamePassword=user.getPassword();


                map.put("message","success");
                return map;

        }


        else{
            map.put("message","FAILURE");
        }

        return map;
    }

//    @RequestMapping("/regist")
//    public Boolean registAccount( String username,String password){
//        User user=loginService.getUserLoginInfo( username,password);
//
//        int value=registService.registAccount(username,password);
//        if (value>0){
//            return true;
//        }
//        return false;
//    }
    @RequestMapping("/getAll")
          public  List<User> getALlUserInfo(){
        System.out.println(i);
        i++;
            return  loginService.getAllUserInfo();

            }


}
