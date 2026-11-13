package MovementStrategiePackage;

import UtilityClasses.Directions;
import UtilityClasses.Pair;

public interface MovementStrategy {
    public Pair nextPosition(Pair currentHead, Directions direction);
}
