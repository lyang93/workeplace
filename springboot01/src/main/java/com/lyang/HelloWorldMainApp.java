package com.lyang;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* @springBootAppLication 来标注一个主程序类
* */
@SpringBootApplication
public class HelloWorldMainApp {

    public static void main(String[] args){
        //spring应用启动起来
        SpringApplication.run(HelloWorldMainApp.class,args);
    }
}
