package com.proxy;

import com.demo.ProxyApplication;
import com.demo.aop.IUserServiceProxy;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = ProxyApplication.class)
public class ProxyApplicationTests {
    @Resource
    private IUserServiceProxy userServiceProxy;

    @Test
    public void test1() throws Exception{
        userServiceProxy.findAll();
//        throw new RuntimeException("异常");
    }
}

