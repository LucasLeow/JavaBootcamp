package com.lucas;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name() {
        return "Luke";
    }

    @Bean
    public int age() {
        return 20;
    }
}
