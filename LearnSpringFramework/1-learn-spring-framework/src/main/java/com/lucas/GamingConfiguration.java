package com.lucas;

import com.lucas.game.MarioGame;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GamingConfiguration {
    @Bean
    public GamingConsole inject_game() {
        var game = new MarioGame();
        return game;
    }

    @Bean
    public GameRunner gameRunner(GamingConsole inject_game) {
        var gameRunner = new GameRunner(inject_game);
        return gameRunner;
    }
}
