package UtilityClasses;

public class GameBoard {
    int height;
    int width;
    static GameBoard instance;

    public GameBoard(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public static GameBoard getInstance(int height,int width){
        if(instance==null){
           instance=new GameBoard(height,width);
        }
        return instance;
    };

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
