package com.demo.jdk_proxy;

public class Hello implements IHello{
    /**
     * 实现接口中的方法
     */
    @Override
    public void sayHello() {
        System.out.println("sayHello");
    }
}
