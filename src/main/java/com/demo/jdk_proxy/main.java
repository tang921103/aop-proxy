package com.demo.jdk_proxy;

public class main {
    public static void main(String[] args){
        //静态代理
//        IHello hello = new HelloProxy(new Hello());
//        hello.sayHello();
        //动态代理
        //1.生成代理对象,实现了目标类相同的接口
        IHello hello = (IHello) new DynaHelloProxy().bind(new Hello());
        //hello引用是IHello类型，但对象是代理类类型.
        hello.sayHello();
    }
}
