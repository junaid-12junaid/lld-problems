package Controller.ConcreteGame;

import Controller.Games;
import PieceFactoryPackage.ConcretePieces.King;
import PieceFactoryPackage.Piece;
import States.GameEnums;
import UtilityClasses.Board;
import UtilityClasses.Cell;
import UtilityClasses.Move;
import UtilityClasses.Player;



import java.util.ArrayList;
import java.util.Scanner;

public class ChessGame implements Games {
    Board board;
    Player player1;
    Player player2;
    boolean isWhite;
    ArrayList<Move> logs;
    GameEnums state;

    public ChessGame( Player player1, Player player2) {
        this.board = Board.getInstance(8);
        this.player1 = player1;
        this.player2 = player2;
        this.isWhite = true;
        this.logs = new ArrayList<>();
        this.state = GameEnums.ACTIVE;
    }

    @Override
    public void play() {
        Scanner scanner=new Scanner(System.in);
        while (this.state==GameEnums.ACTIVE){
            Player currentPlayer=isWhite?player1:player2;
            System.out.println(currentPlayer.getName()+"'s turn ("+(currentPlayer.getWhite()?"White":"Black")+")");

            System.out.println("Enter start the row and col");
            int startRow=scanner.nextInt();
            int startCol= scanner.nextInt();

            System.out.println("Enter end the row and col");
            int endRow=scanner.nextInt();
            int endCol= scanner.nextInt();

            Cell startCell=board.getCell(startRow,startCol);
            Cell endCell=board.getCell(endRow,endCol);

            if(startCell==null||startCell.getPiece()==null){
                System.out.println("Invalid Move the start point is not valid or null");
                continue;
            }

            makeMove(new Move(startCell,endCell),currentPlayer);


        }
    }

    public void makeMove(Move move,Player player ){

       if(move.isValidMove()){
            Piece soucePiece=move.getStartCell().getPiece();
            if(soucePiece.canMove(this.board,move.getStartCell(),move.getEndCell())){
                if(move.getEndCell()!=null) {
                    Piece destinationPiece = move.getEndCell().getPiece();
                    if (destinationPiece != null) {
                        if (destinationPiece instanceof King && isWhite) {
                            this.state = GameEnums.WHITE_WON;
                            System.out.println(player.getName()+" has won");
                            return;
                        }

                        if (destinationPiece instanceof King && !isWhite) {
                            this.state = GameEnums.BLACK_WON;
                            System.out.println(player.getName()+" has won");

                            return;
                        }

                        destinationPiece.setKilled(true);;

                    }
                }
                logs.add(move);

                move.getEndCell().setPiece(soucePiece);
                move.getStartCell().setPiece(null);
                this.isWhite=!isWhite;
                System.out.println("its "+ (isWhite?"White":"black") + "turn");
            }
       }
    }
}
