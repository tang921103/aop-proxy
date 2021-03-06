package com.demo.aop;

import com.demo.entities.User;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

import java.util.List;


//@Component
//@Aspect
public class AopProxy {
    @Before(value="bean(userServiceProxy)")
    public void before(){
        System.out.println("before==========");
    }
    @After(value="bean(userServiceProxy)")
    public void after(){
        System.out.println("After==========");
    }
//    @AfterReturning(value="bean(userServiceProxy)",returning = "returnValue")
    public void afterRuturning(Object returnValue){
        List<User> list = (java.util.List<User>) returnValue;
        System.out.println("afterRuturning==========="+list);
    }
    @AfterThrowing(value = "bean(userServiceProxy)",throwing = "e")
    public void afterThrowing(Exception e){
        System.out.println("afterThrowing========="+e.getMessage());
    }
//    @Around("bean(userServiceProxy)")
    public List<User> around(ProceedingJoinPoint proceedingJoinPoint){
        System.out.println("around  执行前");
        List<User> list = null;
        try {
             list = (java.util.List<User>) proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("around  执行后");
        return list;
    }
    /**
     * 定义切入点
     */
    @Pointcut("execution(* com.demo.aop.UserServiceProxy.*(java.lang.Integer))")
    public void p1(){}

    @Before(value="p1()")
    public void method1(){
        System.out.println("method1");
    }
    @Pointcut("execution(public * findByName(..))")
    public void p2(){}
    @After("p2()")
    public void method2(){
        System.out.println("method2");
    }
}
