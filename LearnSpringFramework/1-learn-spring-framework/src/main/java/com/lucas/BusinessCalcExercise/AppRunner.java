package com.lucas.BusinessCalcExercise;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan
public class AppRunner {
    public static void main(String[] args) {
        try(var context = new AnnotationConfigApplicationContext(AppRunner.class)) {
            System.out.println(context.getBean(BusinessCalculatorService.class).findMax());
        }
    }
}
