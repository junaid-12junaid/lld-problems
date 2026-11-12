package PieceMovementStrategyPattren;

import UtilityClasses.Board;
import UtilityClasses.Cell;

public interface Movestrategy {
    boolean canMove(Board board, Cell startCell, Cell endCell);
}
