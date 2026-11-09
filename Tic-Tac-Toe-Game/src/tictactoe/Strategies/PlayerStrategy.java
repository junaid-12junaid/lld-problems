package tictactoe.Strategies;

import tictactoe.Board;
import tictactoe.Position;

public interface PlayerStrategy {
    public Position makeMove(Board board);
}
