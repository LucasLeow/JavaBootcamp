package com.lucas;

import com.lucas.game.MarioGame;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole game;
    public GameRunner(GamingConsole game) {
        this.game = game;
    }

    public void run() {
        System.out.println("Running game" + this.game);
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
