package com.demo.jdk_proxy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 静态代理
 * 这个类时代理类
 * 基本原理：
 * 我们需要把目标类对象注入进来。代理类选择合适的时机调用我们注入进来的对象的方法。在方法调用前或后执行其他任务。
 */
public class HelloProxy implements IHello{
    //日志记录
    private static Logger logger = LoggerFactory.getLogger(HelloProxy.class);
    private IHello hello;
    public HelloProxy(IHello hello){
        this.hello = hello;
    }
    /**
     * 实现接口中的方法
     */
    @Override
    public void sayHello() {
        logger.info("start----------");
        hello.sayHello();
        logger.info("end------------");
    }
}
