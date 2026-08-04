package src.com.oracle;

import java.util.HashMap;
import java.util.Map;

abstract  class Restorant {
    void foodNotFoundExcetpion() throws Exception{

    }
}

class RestSub extends Restorant {

}

interface FoodFactory {
    FoodFactory registerFood();
    void prepareFood();
    Cuisine deliveryFood();
}

class FoodFactoryImpl implements  FoodFactory{
    FoodFactory foodFactory ;
    FoodFactoryImpl(){

    }
    Map<String, Cuisine> map = new HashMap<String,Cuisine>();
    FoodFactoryImpl(FoodFactory foodFactory){
        this.foodFactory  = foodFactory;
    }

    //@Override
    public FoodFactory registerFood(String food, Cuisine cuisine) {
        map.put(food,cuisine);
        return new FoodFactoryImpl();
    }

    @Override
    public FoodFactory registerFood() {
        return null;
    }

    @Override
    public void prepareFood() {
foodFactory.prepareFood();
    }

    @Override
    public Cuisine deliveryFood() {
   return foodFactory.deliveryFood();
    }
}
class Cuisine {

}

public class FactoryDesingPatter {
}
