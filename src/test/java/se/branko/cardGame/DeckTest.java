package se.branko.cardGame;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeckTest {

    private Deck deck;

    @BeforeEach
    public void setUp() {
        deck = new Deck();
    }
    @Test
    public void testDeckHas52CardsAtStart() {
        assertEquals(52, deck.remainingCards());
    }
    @Test
    public void testDrawCardReducesDeckSize() {
        deck.drawCard();
        assertEquals(51, deck.remainingCards());
    }
}