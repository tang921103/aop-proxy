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
    /*
     *execution：用于匹配方法执行的连接点
     *   注解：可选，方法上持有的注解，如@Deprecated；
         修饰符：可选，如public、protected；
         返回值类型：必填，可以是任何类型模式；“*”表示所有类型；
         类型声明：可选，可以是任何类型模式；
         方法名：必填，可以使用“*”进行模式匹配；
         参数列表：“()”表示方法没有任何参数；“(..)”表示匹配接受任意个参数的方法，
            “(..,java.lang.String)”表示匹配接受java.lang.String类型的参数结束，且其前边可以接受有任意个参数的方法；
            “(java.lang.String,..)” 表示匹配接受java.lang.String类型的参数开始，且其后边可以接受任意个参数的方法；
            “(*,java.lang.String)” 表示匹配接受java.lang.String类型的参数结束，且其前边接受有一个任意类型参数的方法；
            异常列表：可选，以“throws 异常全限定名列表”声明，异常全限定名列表如有多个以“，”分割，
            如throws java.lang.IllegalArgumentException, java.lang.ArrayIndexOutOfBoundsException。
     */
//    @Pointcut("execution(* doDog(..))")
//    public void p1(){}
//    @After(value="p1()")
//    public void joinPoint1(){
//        System.out.println("joinPoint1");
//    }

    /*
     * within：使用“within(类型表达式)”匹配指定类型内的方法执行
     * within(cn.javass..*)       cn.javass包及子包下的任何方法执行
     * within(cn.javass..IPointcutService+)       cn.javass包或所有子包下IPointcutService类型及子类型的任何方法
     * within(@cn.javass..Secure *)   持有cn.javass..Secure注解的任何类型的任何方法必须是在目标对象上声明这个注解，在接口上声明的对它不起作用
     */
//    @Pointcut("within(com.demo.aop.Dog)")
//    public void p2(){}
//    @Before(value = "p2()")
//    public void jionPoint2(){
//        System.out.println("joinPoint2");
//    }

    /*
     *this：使用“this(类型全限定名)”匹配当前AOP代理对象类型的执行方法；注意是AOP代理对象的类型匹配，
     * 这样就可能包括引入接口方法也可以匹配；注意this中使用的表达式必须是类型全限定名，不支持通配符
     */
    @Pointcut("this(com.demo.aop.Dog)")
    public void p3(){}
    @After("p3()")
    public void jointPoint3(){
        System.out.println("jointPoint3");
    }
}
