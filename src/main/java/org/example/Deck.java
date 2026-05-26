package org.example;

import java.util.*;

public class Deck {
    final private Queue<Card> cards;

    public Deck() {
        cards = new LinkedList<>();
        String[] rank = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
        for (String s : rank) {
            for (Suit d : Suit.values()) {
                Card card = new Card(s, d);
                cards.offer(card);
            }
        }
    }

    public void shuffle() {
        ArrayList<Card> list = new ArrayList<>(cards);
        Collections.shuffle(list);
        cards.clear();
        cards.addAll(list);
    }

    public Card draw() {
        return cards.poll();
    }

}
