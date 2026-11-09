package tictactoe;

import tictactoe.GameStateHandler.ConcreteStates.OWonState;
import tictactoe.GameStateHandler.ConcreteStates.XTurnState;
import tictactoe.GameStateHandler.ConcreteStates.XWonState;
import tictactoe.GameStateHandler.Context.GameContext;
import tictactoe.GameStateHandler.GameState;
import tictactoe.Strategies.PlayerStrategy;

public class TicTacToeGame implements BoardGames{
    Board board;
    Player playerX;
    Player playerO;
    Player currentPlayer;
    GameContext context;

    public TicTacToeGame(PlayerStrategy xStrategy,PlayerStrategy oStrategy,int row, int col) {
        this.playerX = new Player("X player",Symbol.X,xStrategy);
        this.board = new Board(row,col);
        this.playerO = new Player("O player",Symbol.O,oStrategy);
        this.currentPlayer = playerX;
        this.context = new GameContext(new XTurnState());
    }
    @Override
    public void play() {
        while(!context.isGameOver()){
           Position position= currentPlayer.getStrategy().makeMove(board);
           board.makeMove(position,currentPlayer.getSymbol());
            board.checkGameState(context,currentPlayer);
            switchPlayer();
        }

        anounceWinner();
    }
    public void switchPlayer(){
        currentPlayer=currentPlayer==playerX?playerO:playerX;
        System.out.println("The Player is now"+currentPlayer.getName());
    }
    public void anounceWinner(){
        GameState state= context.getCurrentState();
        if(state instanceof XWonState){
            System.out.println("X player has won");
        } else if(state instanceof OWonState){
            System.out.println("O player has won");
        }else{
            System.out.println("Its a draw");
        }


    }
}
