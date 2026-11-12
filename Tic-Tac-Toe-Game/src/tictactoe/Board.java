package tictactoe;

import tictactoe.GameStateHandler.Context.GameContext;

public class Board {
    int row;
    int col;
    Symbol[][] board;

    public Board(int row, int col) {
        this.row = row;
        this.col = col;
        board= new Symbol[row][col];
        for(int i=0;i<row;i++){

            for(int j=0;j<col;j++){
                board[i][j]=Symbol.EMPTY;
            }
        }
    }

    public Board(int row) {

    }

    public Boolean isValidMove(Position position){
        return position.row<board.length&&position.col<board[0].length&&board[position.row][position.col]==Symbol.EMPTY&&position.row>=0&&position.col>=0;
    }

    public void makeMove(Position position,Symbol symbol){
        board[position.row][position.col]=symbol;
    }
    public void checkGameState(GameContext context,Player currentPlayer){
        // Row check
       for(int i=0;i<row;i++){
           if(isWiningGrid(board[i])&&board[i][0]!=Symbol.EMPTY){
            context.next(currentPlayer,true);
            return;
           }
       }
       // Col check
        for(int i=0;i<row;i++){
            Symbol[] cols=new Symbol[row];
            for(int j=0;j<col;j++){
                cols[j]=board[j][i];
            }
            if(isWiningGrid(cols)&&cols[0]!=Symbol.EMPTY){
                context.next(currentPlayer,true);
                return;
            }
        }
        // Diagonal Check
        int minTraversal=Math.min(row,col);
        Symbol[] diagonal1=new Symbol[minTraversal];
        Symbol[] diagonal2=new Symbol[minTraversal];
        for(int i=0;i<minTraversal;i++){
            diagonal1[i]=board[i][i];
            diagonal2[i]=board[i][minTraversal-1-i];
        }
        if(isWiningGrid(diagonal1)&&diagonal1[0]!=Symbol.EMPTY){
            context.next(currentPlayer,true);
            return;
        }
        if(isWiningGrid(diagonal2)&&diagonal2[0]!=Symbol.EMPTY){
            context.next(currentPlayer,true);
            return;
        }
        context.next(currentPlayer,false);
    }
    public Boolean isWiningGrid(Symbol[] line){
      Symbol first=line[0];
      for(Symbol s:line){
          if(first!=s) return  false;
      }
      return true;
    }

}
