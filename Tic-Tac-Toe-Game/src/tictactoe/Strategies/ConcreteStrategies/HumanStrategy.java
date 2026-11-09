package tictactoe.Strategies.ConcreteStrategies;

import tictactoe.Board;
import tictactoe.Position;
import tictactoe.Strategies.PlayerStrategy;

import java.util.Scanner;

public class HumanStrategy implements PlayerStrategy {
    String PlayerName;
    Scanner scanner;

    public HumanStrategy(String playerName) {
        PlayerName = playerName;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public Position makeMove(Board board) {
    while (true){
        System.out.println("Please enter your move row and col");
        try {
            int row = scanner.nextInt();
            int col = scanner.nextInt();

            Position move = new Position(row, col);
            if (board.isValidMove(move)) {
                return move;
            }
            System.out.println("Sorry invalid move please provide the valid move");
        } catch (Exception e) {
            scanner.nextLine();
            throw new RuntimeException(e);

        }
    }
    }
}
