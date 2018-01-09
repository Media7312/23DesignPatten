package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: 鸡肉汉堡，继承汉堡抽象类
 * @Date: Created in 9:42 2018/1/9
 */
public class ChickenBurger extends Burger{
    @Override
    public float price() {
        return 30.0f;
    }

    @Override
    public String name() {
        return "ChickenBurger()";
    }
}
