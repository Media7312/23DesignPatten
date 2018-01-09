package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: 蔬菜汉堡，继承汉堡抽象类
 * @Date: Created in 9:39 2018/1/9
 */
public class VegBurger extends Burger{
    /**
     * 价格:默认25
     */
    @Override
    public float price() {
        return 25.0f;
    }
    /**
     *汉堡名称
     */
    @Override
    public String name() {
        return "VegBurger()";
    }
}
