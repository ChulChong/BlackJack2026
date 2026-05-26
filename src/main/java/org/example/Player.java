package org.example;

import java.util.ArrayList;
import java.util.List;

public class Player {
    public String getName() {
        return name;
    }

    public List<Card> getHand() {
        return hand;
    }

    final private String name;
    final private List<Card> hand;


    public Player(String name) {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    public void addCard(Card card) {
        hand.add(card);
    }

    public void showHand() {
        for (Card card : hand) {
            System.out.println(card);
        }
        System.out.println("Score: " + getScore());
    }

    public void showFirstCard() {
        System.out.println(hand.getFirst());
    }

    public int getScore() {
        int total = 0;
        int aceCount = 0;
        for (Card card : hand) {
            if (card.getRank().equals("A")) {
                aceCount++;
            }
            total += card.getValue();
        }
        while (total > 21 && aceCount > 0) {
            total -= 10;
            aceCount--;
        }
        return total;
    }

}
