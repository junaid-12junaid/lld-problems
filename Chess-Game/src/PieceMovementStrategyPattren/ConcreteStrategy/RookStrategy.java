package PieceMovementStrategyPattren.ConcreteStrategy;

import PieceMovementStrategyPattren.Movestrategy;
import UtilityClasses.Board;
import UtilityClasses.Cell;

public class RookStrategy implements Movestrategy {
    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return true;
    }
}
