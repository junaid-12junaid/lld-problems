package PieceFactoryPackage;

import PieceMovementStrategyPattren.Movestrategy;
import UtilityClasses.Board;
import UtilityClasses.Cell;

public abstract class Piece {
    public Boolean isWhitePiece;
    Boolean isKilled;
    Movestrategy movestrategy;

    public Piece(Boolean isWhitePiece, Boolean isKilled,Movestrategy movestrategy) {
        this.isWhitePiece = isWhitePiece;
        this.isKilled = isKilled;
        this.movestrategy=movestrategy;
    }

    public Boolean getWhitePiece() {
        return isWhitePiece;
    }

    public void setWhitePiece(Boolean whitePiece) {
        isWhitePiece = whitePiece;
    }

    public Boolean getKilled() {
        return isKilled;
    }

    public void setKilled(Boolean killed) {
        isKilled = killed;
    }

    public Movestrategy getMovestrategy() {
        return movestrategy;
    }

    public void setMovestrategy(Movestrategy movestrategy) {
        this.movestrategy = movestrategy;
    }
    public Boolean canMove(Board board, Cell startCell ,Cell endCell){
      return  movestrategy.canMove( board,  startCell , endCell);
    }
}
