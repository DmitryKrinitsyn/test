package com.dkrinitsyn;

import java.util.Random;

enum GameElement {
    ROCK,
    PAPER,
    SCISSORS;

    static GameElement getRandomElement(){
        return values()[RANDOM.nextInt(values().length)];
    }

    private static final Random RANDOM = new Random();
}

