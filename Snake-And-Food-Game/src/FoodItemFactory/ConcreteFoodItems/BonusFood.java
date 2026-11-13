package FoodItemFactory.ConcreteFoodItems;

import FoodItemFactory.FoodItem;

public class BonusFood extends FoodItem {
    public BonusFood(int col, int row) {
        super(col, row);
        this.points=2;
    }
}
