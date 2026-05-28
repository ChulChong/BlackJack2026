import org.example.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlackJackTest {

    @Test
    void aceReturns11() {
        Card card = new Card("A", Suit.Hearts);
        assertEquals(11, card.getValue());
    }

    @Test
    void JQKReturns10() {
        Card cardJ = new Card("J", Suit.Hearts);
        Card cardQ = new Card("Q", Suit.Hearts);
        Card cardK = new Card("K", Suit.Hearts);
        assertEquals(10, cardJ.getValue());
        assertEquals(10, cardQ.getValue());
        assertEquals(10, cardK.getValue());
    }

    @Test
    void fiftyTwoCardsInADeck() {
        Deck deck = new Deck();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    void isCardSizeDreacrsingAfterDraw() {
        Deck deck = new Deck();
        deck.draw();
        assertEquals(51, deck.getCards().size());
    }

    @Test
    void isCardSizeSameAfterShuffle() {
        Deck deck = new Deck();
        deck.shuffle();
        assertEquals(52, deck.getCards().size());
    }

    @Test
    void APlusKEquals21() {
        Player player = new Player("test");
        player.addCard(new Card("A", Suit.Hearts));
        player.addCard(new Card("K", Suit.Hearts));
        assertEquals(21, player.getScore());
    }

    @Test
    void APlusKPlus5Eqauls16() {
        Player player = new Player("test");
        player.addCard(new Card("A", Suit.Hearts));
        player.addCard(new Card("K", Suit.Hearts));
        player.addCard(new Card("5", Suit.Hearts));
        assertEquals(16, player.getScore());
    }

    @Test
    void APlusAEqauls12() {
        Player player = new Player("test");
        player.addCard(new Card("A", Suit.Hearts));
        player.addCard(new Card("A", Suit.Diamonds));
        assertEquals(12, player.getScore());
    }
}
