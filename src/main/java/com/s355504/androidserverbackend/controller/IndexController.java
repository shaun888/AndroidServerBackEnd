package com.s355504.androidserverbackend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexController {


    @GetMapping("/")
    public String index(){
        return "login";
    }

    @GetMapping("/success")
    public String success(){
        return "success";
    }

    @RequestMapping("/register")
    public String register(HttpServletRequest request) {

        return "register";
    }

    @RequestMapping("/loginout")
    public String loginOut(HttpServletRequest request) {
        request.getSession().invalidate();
        return "redirect:/";
    }
}
