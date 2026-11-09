package tictactoe.GameStateHandler.Context;
import tictactoe.GameStateHandler.GameState;
import tictactoe.Player;

public class GameContext {
    public GameState currentState;

    public GameContext(GameState currentState) {
        this.currentState = currentState;
    }

    public void setCurrentState(GameState currentState) {
        this.currentState = currentState;
    }

    public GameState getCurrentState() {
       return  currentState;
    }

    public Boolean isGameOver(){
        return currentState.isGameOver();
    }
    public void next(Player player,Boolean hasWon){
        currentState.next(this,player,hasWon);
    }

}
