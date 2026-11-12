package tictactoe;

import tictactoe.Strategies.ConcreteStrategies.HumanStrategy;

public class Main {
    public static void main(String[] args) {
        HumanStrategy playerX=new HumanStrategy("UtilityClasses.Player X");
        HumanStrategy playerO=new HumanStrategy("UtilityClasses.Player O");

        TicTacToeGame ticTacToeGame=new TicTacToeGame(playerX,playerO,3,3);
        ticTacToeGame.play();
    }
}
