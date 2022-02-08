package com.s355504.androidserverbackend.controller;


import com.s355504.androidserverbackend.entity.User;
import com.s355504.androidserverbackend.service.LoginService;
import com.s355504.androidserverbackend.service.RegistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/web")
public class WebLoginController {
    @Autowired
    LoginService loginService;
    @Autowired
    RegistService registService;

    @RequestMapping("/login")
    public String getLoginInfo(String username, String password, HttpServletRequest request){

        User user=loginService.getUserLoginInfo(username, password);
//        User user=new User();
//        user.setUsername(username);
//        user.setPassword(password);

        if (user!=null){

            request.getSession().setAttribute("user",user);
            return "success";
        }else {
            return "login";
        }

    }

    @RequestMapping("/register")
    public String registAccount( String username,String password){

        boolean flag= registService.registAccount(username, password);
        if (flag==false){
            return "register";
        }else{
            return "registersuccess";
        }
    }





}
