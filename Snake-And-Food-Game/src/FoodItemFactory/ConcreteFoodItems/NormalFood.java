package FoodItemFactory.ConcreteFoodItems;

import FoodItemFactory.FoodItem;

public class NormalFood extends FoodItem {
    public NormalFood(int col, int row) {
        super(col, row);
        this.points=1;
    }
    @Override
    public int getPoints(){
        return 1;
    }
}
