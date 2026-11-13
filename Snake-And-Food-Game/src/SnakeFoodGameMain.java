import Controller.SnakeGame;
import MovementStrategiePackage.ConcreteMovementClasses.HumanStrategy;
import Observer.ConcreteObserver.ConsoleObserver;
import Observer.GameObserver;
import UtilityClasses.Directions;

import java.util.Scanner;

public class SnakeFoodGameMain {
    public static void main(){
        int width=20;
        int height=15;
        int[][] food={
                {0, 2}, // Initial food
                {1, 3}, // Second food
                {3, 12}, // Third food
                {8, 17}, // Fourth food
                {12, 3} // Fifth food
        };
        SnakeGame snakeGame=new SnakeGame(height,width,new HumanStrategy(),food);
        snakeGame.setObservers(new ConsoleObserver());
        Scanner scanner=new Scanner(System.in);
        boolean gameRuning=true;
        int score=0;
        while (gameRuning){
            System.out.println("Enter the direction for game");
            String input=scanner.nextLine().toUpperCase();
            Directions directions=getDirection(input);

            score= snakeGame.move(directions);
            if(score==-1){
                System.out.println("Game got over snake got bit by itself or it is out of board - Crashed");
                gameRuning=false;

            }else{
                System.out.println("the score"+score);
            }
        }
        for(GameObserver o:snakeGame.getObservers()){
            o.onGameOver(score);
        }
        scanner.close();
        System.out.println("thanks for playing the game");
    }

    public static Directions getDirection(String type){
        if("U".equals(type)){
            return Directions.UP;
        } else if ("D".equals(type)) {
            return Directions.DOWN;

        }else if ("L".equals(type)) {
            return Directions.LEFT;

        }else if ("R".equals(type)) {
            return Directions.RIGHT;

        }
        return null;
    }
}
