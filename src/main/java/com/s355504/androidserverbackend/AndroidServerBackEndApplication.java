package com.s355504.androidserverbackend;


import org.junit.runner.RunWith;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.test.context.junit4.SpringRunner;

//@SpringBootApplication 默认扫描当前类的同包以及子包下的类
@SpringBootApplication
@RunWith(SpringRunner.class)
public class AndroidServerBackEndApplication {

    public static void main(String[] args) {
        SpringApplication.run(AndroidServerBackEndApplication.class, args);
    }

}
