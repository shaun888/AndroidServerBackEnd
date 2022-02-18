package com.s355504.androidserverbackend;


import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootApplication 默认扫描当前类的同包以及子包下的类
@SpringBootApplication
@RunWith(SpringRunner.class)
public class AndroidServerBackEndApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(AndroidServerBackEndApplication.class, args);
    }
    //重写配置方法
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AndroidServerBackEndApplication.class);
    }
}
