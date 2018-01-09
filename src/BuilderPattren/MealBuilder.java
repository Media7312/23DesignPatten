package BuilderPattren;

/**
 * @Author: Media7312
 * @Description:
 * @Date: Created in 17:21 2018/1/9
 */
public class MealBuilder {
    public Meal prepareVegAndCocacola(){
        Meal meal = new Meal();
        /**
         *加入VegBurger
         */
        meal.addIterm(new VegBurger());
        /**
         *加入Cocacola
         */
        meal.addIterm(new CocaCola());
        return meal;
    }
    public Meal prepareChickenBurgerAndPepsi(){
        Meal meal = new Meal();
        meal.addIterm(new ChickenBurger());
        meal.addIterm(new PepsiCola());

        return meal;

    }
    public Meal getPrepareNoInfo(Burger burger,Drink drink){
        Meal meal = new Meal();
        meal.addIterm(burger);
        meal.addIterm(drink);
        return meal;
    }
}
