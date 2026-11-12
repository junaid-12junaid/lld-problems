package PieceFactoryPackage.ConcretePieces;

import PieceFactoryPackage.Piece;
import PieceMovementStrategyPattren.Movestrategy;
import UtilityClasses.Board;
import UtilityClasses.Cell;

public class Rook extends Piece {
    public Rook(Boolean isWhitePiece, Boolean isKilled, Movestrategy movestrategy) {
        super(isWhitePiece, isKilled,movestrategy);
    }
    @Override
    public Boolean canMove(Board board, Cell startCell, Cell endCell) {
        return super.canMove(board, startCell, endCell);
    }
}
