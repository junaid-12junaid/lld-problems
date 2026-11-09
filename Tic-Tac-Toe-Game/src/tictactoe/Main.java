package tictactoe;

import tictactoe.Strategies.ConcreteStrategies.HumanStrategy;

public class Main {
    public static void main(String[] args) {
        HumanStrategy playerX=new HumanStrategy("Player X");
        HumanStrategy playerO=new HumanStrategy("Player O ");

        TicTacToeGame ticTacToeGame=new TicTacToeGame(playerX,playerO,3,3);
        ticTacToeGame.play();
    }
}
