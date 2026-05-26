import org.example.Card;
import org.example.Suit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BlackJackTest {

    @Test
    void aceReturns11() {
        Card card = new Card("A", Suit.Hearts);
        assertEquals(11, card.getValue());
    }
}
