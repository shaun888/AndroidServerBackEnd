package com.s355504.androidserverbackend.config;


import com.s355504.androidserverbackend.config.intercepors.LoginInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfigurer implements WebMvcConfigurer {



    @Override
    public void addInterceptors(InterceptorRegistry registry) {

        LoginInterceptor loginInterceptor = new LoginInterceptor();
        InterceptorRegistration loginRegistry = registry.addInterceptor(loginInterceptor);

        loginRegistry.addPathPatterns("/**");

        loginRegistry.excludePathPatterns("/");
        loginRegistry.excludePathPatterns("/web/login");
        loginRegistry.excludePathPatterns("/register");
        loginRegistry.excludePathPatterns("/web/register");
        loginRegistry.excludePathPatterns("/user/getAll");
        loginRegistry.excludePathPatterns("/user/userLogin");
//        loginRegistry.excludePathPatterns("/css/login/*.css");
//        loginRegistry.excludePathPatterns("/js/login/**/*.js");
//        loginRegistry.excludePathPatterns("/image/login/*.png");
    }




    }
