package tictactoe.GameStateHandler;

import tictactoe.GameStateHandler.Context.GameContext;
import tictactoe.Player;

public interface GameState {
    public void next(GameContext context, Player player, boolean hasWon);
    public Boolean isGameOver();
}
