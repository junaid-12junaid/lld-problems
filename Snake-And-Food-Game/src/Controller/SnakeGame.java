package Controller;

import FoodItemFactory.FoodItem;
import MovementStrategiePackage.MovementStrategy;
import Observer.GameObserver;
import UtilityClasses.Directions;
import UtilityClasses.GameBoard;
import UtilityClasses.Pair;
import UtilityClasses.Snake;

import java.util.ArrayList;
import java.util.Deque;

public class SnakeGame {
    GameBoard board;
    Snake snake;
    MovementStrategy movementStrategy;
    int foodIndex;
    int[][] food;
    ArrayList<GameObserver> observers;

    public SnakeGame(int height,int width, MovementStrategy movementStrategy, int[][] food) {
        this.board = new GameBoard(height,width);
        this.snake = new Snake();
        this.movementStrategy = movementStrategy;
        this.foodIndex = 0;
        this.food = food;
        this.observers=new ArrayList<>();
    }

    public ArrayList<GameObserver> getObservers() {
        return this.observers;
    }

    public void setObservers(GameObserver ele) {
         this.observers.add(ele);
    }

    public void setMovementStrategy(MovementStrategy movementStrategy) {
        this.movementStrategy = movementStrategy;
    }

    public int move(Directions direction){
        Pair curHead=snake.body.peekFirst();
        Pair nextHead=movementStrategy.nextPosition(curHead,direction);

        for(GameObserver o:observers){
            o.onMoveMade(curHead,nextHead);
        }

        int nextRow=nextHead.getRow();
        int nextCol=nextHead.getCol();
        System.out.println("row "+nextRow +" col "+nextCol);

        //  Check boundary conditions
        Boolean isBoardEnded=nextRow<0||nextCol>this.board.getWidth()||nextCol<0||nextRow>this.board.getHeight();

        Pair curTail=snake.body.getLast();
        //  Check if snake bites itself (excluding tail which will move away)
        Boolean hasBittedItself=snake.positionMap.containsKey(nextHead)&&(curTail.getRow()!=nextRow&&curTail.getCol()!=nextCol);

        if(isBoardEnded||hasBittedItself){

            return -1;
        }

        Boolean ateFood=(this.foodIndex<this.food.length)&&(this.food[foodIndex][0]==nextRow&&this.food[foodIndex][1]==nextCol);

        if (ateFood) {
            for(GameObserver o:observers){
                o.onFoodEaten(foodIndex,food[foodIndex]);
            }
            this.foodIndex++;
        }else{
            this.snake.positionMap.remove(curTail);
            this.snake.body.removeLast();
        }

        this.snake.positionMap.put(nextHead,true);
        this.snake.body.addFirst(nextHead);


        return this.snake.body.size()-1;

    }
    public Deque<Pair> getBody(){
        return this.snake.getBody();
    }
}
