package FoodItemFactory;

public abstract class FoodItem {
    protected  int row,col;
    protected int points;

    public FoodItem(int col, int row) {
        this.col = col;
        this.row = row;
    }

    public int getRow() {
        return row;
    }

    public int getCol() {
        return col;
    }

    public int getPoints() {
        return points;
    }
}
