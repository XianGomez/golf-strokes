package edu.teamrocket.golfstrokes;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class PlayerTest {

    private Player playerMJ;

    @BeforeEach
    void setUp() {
        playerMJ = new Player("MJ", (byte) 0);
    }

    @Test
    void constructorCreatesPlayerObject() {
        Player playerMJ = new Player("MJ", (byte) 0);
        assertNotNull(playerMJ);
    }

    @Test
    void constructorGetsInitialsAndHandicap() {
        Player playerMJ = new Player("MJ", (byte) 0);
        assertEquals("MJ", playerMJ.getInitials());
        assertEquals((byte) 0, playerMJ.getHandicap());

    }

    @Test
    void getPointsReturnsZero() {
        assertEquals((short) 0, playerMJ.getPoints());
    }

    @Test
    void getScoreReturnsZero() {
        assertEquals((short) 0, playerMJ.getScore());
    }

    
}
