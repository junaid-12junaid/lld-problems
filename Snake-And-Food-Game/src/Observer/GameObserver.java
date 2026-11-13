package Observer;

import UtilityClasses.Pair;

public interface GameObserver {
    public void onMoveMade(Pair oldHead,Pair newHead);
    public void onFoodEaten(int newScore,int[] positionFoodFound);
    public void onGameOver(int finalScore);
}
