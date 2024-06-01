package com.lucas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2BasicJava {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
        System.out.println(context.getBean("name"));
    }
}
