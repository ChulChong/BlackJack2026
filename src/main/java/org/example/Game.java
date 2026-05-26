package org.example;

import java.util.Comparator;
import java.util.Scanner;

public class Game {
    final private Deck deck;
    final private Player player;
    final private Player dealer;

    public Game(Player player) {
        this.deck = new Deck();
        this.player = player;
        this.dealer = new Player("Dealer");
        deck.shuffle();
        for (int i = 0; i < 2; i++) {
            player.addCard(deck.draw());
            dealer.addCard(deck.draw());
        }
    }

    public void startGame() {
        System.out.println("=== Your Hand ===");
        player.showHand();
        System.out.println("=== Dealer's Hand ===");
        dealer.showFirstCard();
    }

    public void playerTurn() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Hit or Stand? (h/s)");
            String input = scanner.nextLine();
            if (input.equals("h")) {
                player.addCard(deck.draw());
                player.showHand();
                player.getScore();
            } else if (input.equals("s")) {
                dealerTurn();
                break;
            }
            if (player.getScore() > 21) {
                System.out.println("Bust! you lose.");
                break;
            }
        }
    }

    public void dealerTurn() {
        while (dealer.getScore() < 17) {
            dealer.addCard(deck.draw());
        }
        dealer.showHand();
    }

    public Player determineWinner() {
        if (player.getScore() > 21) {
            return dealer; // 플레이어 bust
        } else if (dealer.getScore() > 21) {
            return player; // 딜러 bust
        } else if (player.getScore() > dealer.getScore()) {
            return player;
        } else if (player.getScore() < dealer.getScore()) {
            return dealer;
        } else {
            return null; // 무승부
        }
    }
}
