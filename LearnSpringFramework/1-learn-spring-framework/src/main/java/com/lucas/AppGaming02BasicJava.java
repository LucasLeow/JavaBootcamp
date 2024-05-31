package com.lucas;

import com.lucas.game.MarioGame;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppGaming02BasicJava {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
    }
}
