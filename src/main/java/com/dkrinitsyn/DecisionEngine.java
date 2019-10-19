package com.dkrinitsyn;

import org.apache.commons.collections4.map.MultiKeyMap;

import static com.dkrinitsyn.GameElement.*;
import static com.dkrinitsyn.MatchResult.*;

class DecisionEngine {

    private static final MultiKeyMap<GameElement, MatchResult> decisions = new MultiKeyMap<>();

    static {
        decisions.put(SCISSORS, SCISSORS, REMATCH);
        decisions.put(SCISSORS, ROCK, SECOND_WON);
        decisions.put(SCISSORS, PAPER, FIRST_WON);

        decisions.put(ROCK, SCISSORS, FIRST_WON);
        decisions.put(ROCK, ROCK, REMATCH);
        decisions.put(ROCK, PAPER, SECOND_WON);

        decisions.put(PAPER, SCISSORS, SECOND_WON);
        decisions.put(PAPER, ROCK, FIRST_WON);
        decisions.put(PAPER, PAPER, REMATCH);
    }

    MatchResult match(GameElement firstPlayerGameElement, GameElement secondPlayerGameElement){
        return decisions.get(firstPlayerGameElement, secondPlayerGameElement);
    }
}
