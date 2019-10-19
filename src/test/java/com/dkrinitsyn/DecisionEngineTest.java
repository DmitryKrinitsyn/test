package com.dkrinitsyn;

import org.junit.Before;
import org.junit.Test;

import static com.dkrinitsyn.GameElement.*;
import static com.dkrinitsyn.MatchResult.*;
import static org.junit.Assert.assertEquals;

public class DecisionEngineTest {

    private DecisionEngine decisionEngine = null;

    @Before
    public void before() {
        decisionEngine = new DecisionEngine();
    }

    @Test
    public void shouldMakeRightDecision() {
        assertEquals(decisionEngine.match(SCISSORS, SCISSORS), REMATCH);
        assertEquals(decisionEngine.match(SCISSORS, ROCK), SECOND_WON);
        assertEquals(decisionEngine.match(SCISSORS, PAPER), FIRST_WON);

        assertEquals(decisionEngine.match(ROCK, ROCK), REMATCH);
        assertEquals(decisionEngine.match(ROCK, SCISSORS), FIRST_WON);
        assertEquals(decisionEngine.match(ROCK, PAPER), SECOND_WON);

        assertEquals(decisionEngine.match(PAPER, PAPER), REMATCH);
        assertEquals(decisionEngine.match(PAPER, SCISSORS), SECOND_WON);
        assertEquals(decisionEngine.match(PAPER, ROCK), FIRST_WON);
    }
}
