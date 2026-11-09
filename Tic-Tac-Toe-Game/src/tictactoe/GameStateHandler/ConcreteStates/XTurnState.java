package tictactoe.GameStateHandler.ConcreteStates;

import tictactoe.GameStateHandler.Context.GameContext;
import tictactoe.GameStateHandler.GameState;
import tictactoe.Player;
import tictactoe.Symbol;

public class XTurnState implements GameState {
    @Override
    public void next(GameContext context, Player player, boolean hasWon) {
        if(hasWon){
            context.setCurrentState(player.getSymbol()== Symbol.O?new OWonState():new XWonState());
        }else {
            context.setCurrentState(new OTurnState());
        }
    }

    @Override
    public Boolean isGameOver() {
        return false;
    }
}
