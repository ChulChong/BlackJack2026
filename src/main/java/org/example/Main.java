package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Player player = new Player("Chul");
        Game game = new Game(player);
        game.startGame();
        game.playerTurn();
        Player winner = game.determineWinner();
        if (winner == null) {
            System.out.println("Draw!");
        } else {
            System.out.println(winner.getName() + " wins!");
        }
    }
}