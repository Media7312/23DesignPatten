package BuilderPattren;

/**
 * @Author: Media7312
 * @Description:
 * @Date: Created in 17:42 2018/1/9
 */
public class MealBuilderTest {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();
        Meal mealA = mealBuilder.prepareVegAndCocacola();
        Meal mealB = mealBuilder.prepareChickenBurgerAndPepsi();
        Meal mealC = mealBuilder.getPrepareNoInfo(new VegBurger(),new PepsiCola());
        mealA.showItems();
        mealB.showItems();
        mealC.showItems();
    }
}
