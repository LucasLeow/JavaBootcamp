package com.lucas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaming3SpringBeans {
    public static void main(String[] args) {
        try(var context=  new AnnotationConfigApplicationContext(GamingConfiguration.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
