package com.proxy;

import com.demo.ProxyApplication;
import com.demo.aop.Dog;
import com.demo.aop.Friends;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProxyApplication.class)
public class DogTestProxy {
    @Resource
    private Friends dog;
    @Test
    public void test1(){
//        dog.doDog();
        dog.friend();
    }
}
