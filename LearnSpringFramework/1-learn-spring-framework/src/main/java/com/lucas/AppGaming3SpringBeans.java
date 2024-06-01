package com.lucas;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.lucas")
public class AppGaming3SpringBeans {

    public static void main(String[] args) {
        try(var context=  new AnnotationConfigApplicationContext(AppGaming3SpringBeans.class)) {
            context.getBean(GameRunner.class).run();
        }
    }
}
