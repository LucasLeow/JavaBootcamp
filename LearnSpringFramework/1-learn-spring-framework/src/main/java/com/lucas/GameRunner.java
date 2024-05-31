package com.lucas;

import com.lucas.game.MarioGame;

public class GameRunner {
    MarioGame game;
    public GameRunner(MarioGame marioGame) {
        this.game = marioGame;
    }

    public void run() {
        System.out.println("Running game" + this.game);
    }
}
