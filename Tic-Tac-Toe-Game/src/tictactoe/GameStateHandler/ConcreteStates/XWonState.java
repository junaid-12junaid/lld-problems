package tictactoe.GameStateHandler.ConcreteStates;

import tictactoe.GameStateHandler.Context.GameContext;
import tictactoe.GameStateHandler.GameState;
import tictactoe.Player;

public class XWonState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {

    }

    @Override
    public Boolean isGameOver() {
        return true;
    }
}
