package com.demo.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * 定义切面类
 * @Component 创建bean对象，交给容器去管理
 * @Aspect 声明这是一个切面类
 */
@Component
@Aspect
public class AopProxys {
    /*
     *1.spring AOP风格
     * 2.AspectJ风格
     */

    /**
     * 定义切入点pointcut
     * 匹配'修饰符为public 任意返回值类型 方法名为doDog 任意类型及数量的参数' 的方法
     */
//    @Pointcut("execution(* doDog(..))")
//    public void p1(){}
//    @After(value="p1()")
//    public void joinPoint1(){
//        System.out.println("joinPoint1");
//    }
    @Pointcut()
    public void p2(){}
    @Before(value = "p2()")
    public void jionPoint2(){
        System.out.println("joinPoint2");
    }
}
