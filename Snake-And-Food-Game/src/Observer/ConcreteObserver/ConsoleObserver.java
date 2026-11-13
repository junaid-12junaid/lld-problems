package Observer.ConcreteObserver;

import Observer.GameObserver;
import UtilityClasses.Pair;

import java.util.Arrays;

public class ConsoleObserver implements GameObserver {
    @Override
    public void onMoveMade(Pair oldHead, Pair newHead) {
        System.out.println(" oldHead "+oldHead+" newHead "+newHead);
    }

    @Override
    public void onFoodEaten(int newScore, int[] positionFoodFound) {
        System.out.println(" newScore "+newScore+" positionFoodFound  "+ Arrays.toString(positionFoodFound));

    }

    @Override
    public void onGameOver(int finalScore) {
        System.out.println(" finalScore "+finalScore);

    }
}
