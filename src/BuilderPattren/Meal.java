package BuilderPattren;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Media7312
 * @Description:
 * @Date: Created in 9:27 2018/1/9
 */
public class Meal {
    private List<Item> items = new ArrayList<Item>();
    public void addIterm(Item item){
        items.add(item);

    }
    public float getCoat(){
        float cost = 0.0f;
        for(Item item:items){
            cost = + item.price();

        }
        return cost;
    }
    public void showItems(){
        for(Item item:items){
            System.out.println("Name:"+item.name());
            System.out.println("Packing:"+item.packing().packing());
            System.out.println("Price()"+item.price());
        }

    }

}
