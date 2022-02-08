package com.s355504.androidserverbackend;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication 默认扫描当前类的同包以及子包下的类
@SpringBootApplication
public class AndroidServerBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidServerBackEndApplication.class, args);
    }

}
