package org.example;

public class Card {
    final private String rank;
    final private Suit suit;

    public String getRank() {
        return rank;
    }

    public Card(String rank, Suit suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public int getValue() {
        int val = 0;
        if (rank.equals("J") || rank.equals("Q") || rank.equals("K")) {
            val = 10;
        } else if (rank.equals("A")) {
            val = 11;
        } else {
            val = Integer.parseInt(rank);
        }
        return val;
    }

    @Override
    public String toString() {
        return rank + " of " + suit;
    }

}
