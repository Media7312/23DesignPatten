package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: Coca继承自Drink抽象类
 * @Date: Created in 9:45 2018/1/9
 */
public class CocaCola extends Drink{
    /**
     *价格
     */
    @Override
    public float price() {
        return 4.0f;
    }

    @Override
    public String name() {
        return "CocaCola()";
    }
}
