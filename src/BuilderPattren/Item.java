package BuilderPattren;

/**
 * @Author: Media7312
 * @Description: 食品套餐
 * @Date: Created in 9:26 2018/1/9
 */
public interface Item {
    String name();
    /**
     *打包方式
     */
    Packing packing();
    float price();
}
