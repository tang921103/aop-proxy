package com.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@SpringBootApplication
@MapperScan("com.demo.dao")
@EnableAspectJAutoProxy
public class ProxyApplication {
    public static void main(String[] args){
        SpringApplication.run(ProxyApplication.class,args);
    }
}
