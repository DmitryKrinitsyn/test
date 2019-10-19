package com.dkrinitsyn;

import static com.dkrinitsyn.GameElement.ROCK;


public class RockPaperScissorsGame {

    private final static DecisionEngine DECISION_ENGINE = new DecisionEngine();
    private final static GameElement FIRST_PLAYER_GAME_ELEMENT = ROCK;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i = i + 1) {
            final GameElement secondPlayerGameElement = GameElement.getRandomElement();
            final MatchResult matchResult = DECISION_ENGINE.match(FIRST_PLAYER_GAME_ELEMENT, secondPlayerGameElement);
            outputResult(FIRST_PLAYER_GAME_ELEMENT, secondPlayerGameElement, matchResult);
        }
    }

    private static void outputResult(final GameElement firstPlayerGameElement,
                                     final GameElement secondPlayerGameElement,
                                     final MatchResult matchResult){
        System.out.println(String.format("%s vs %s -> %s", firstPlayerGameElement, secondPlayerGameElement, matchResult));
    }
}
