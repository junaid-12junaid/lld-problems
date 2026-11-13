package MovementStrategiePackage.ConcreteMovementClasses;

import MovementStrategiePackage.MovementStrategy;
import UtilityClasses.Directions;
import UtilityClasses.Pair;

public class HumanStrategy implements MovementStrategy {
    @Override
    public Pair nextPosition(Pair currentHead, Directions direction) {
        int curRow=currentHead.getRow();
        int curCol=currentHead.getCol();

        switch (direction){
            case UP -> {
               return new Pair(curRow-1,curCol);
            }
            case DOWN -> {
                return new Pair(curRow+1,curCol);

            }case LEFT -> {

                return new Pair(curRow,curCol-1);
            }
            case RIGHT -> {
                return new Pair(curRow,curCol+1);
            }
            default -> {
                new IllegalStateException("there is no direction of the provided here");
            }
        }
        return null;
    }
}
