package PieceMovementStrategyPattren.ConcreteStrategy;

import PieceMovementStrategyPattren.Movestrategy;
import UtilityClasses.Board;
import UtilityClasses.Cell;

public class KnightStrategy implements Movestrategy {
    @Override
    public boolean canMove(Board board, Cell startCell, Cell endCell) {
        return true;
    }
}
