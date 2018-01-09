package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: 饮料抽象类
 * @Date: Created in 9:43 2018/1/9
 */
public abstract class Drink implements Item{
    /**
     *打包方式：Bottle（）
     */
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
