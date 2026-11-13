package FoodItemFactory;

import FoodItemFactory.ConcreteFoodItems.BonusFood;
import FoodItemFactory.ConcreteFoodItems.NormalFood;

public class FoodFactory {
    public FoodItem getFoodItem(String type,int row,int col){
        switch (type.toLowerCase()){
            case "normal":
                return new NormalFood(row,col);
            case "bonus":
                return new BonusFood(row,col);
            default:
              new  IllegalArgumentException("The type is not present");
        }
        return null;
    };
}
