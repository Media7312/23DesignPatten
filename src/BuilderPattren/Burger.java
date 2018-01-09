package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: 抽象类（汉堡）1.包装方式 2.种类
 * @Date: Created in 9:34 2018/1/9
 */
public abstract class Burger implements Item{

    /**
     * 默认功能：确定汉堡打包方式：Wrapper（）
     */
    @Override
    public Packing packing() {
        return new Wrapper();
    }
    /**
     * 价格
     */
    @Override
    abstract public float price();
}
