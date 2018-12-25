package com.demo.aop;

import org.springframework.stereotype.Component;

/**
 * Dog类继承Amimal，实现Friends
 */
@Component
public class Dog extends Animal implements Friends{
    public void doDog(){
        System.out.println("dog");
    }

    @Override
    public void friend() {
        System.out.println("friends");
    }
}
