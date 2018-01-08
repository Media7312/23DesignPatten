package AbstractFactoryPattren;

/**
 * @Author: Media7312
 * @Description: 抽象类工厂
 * @Date: Created in 21:57 2018/1/8
 */
public abstract class AbstractFactory {
    abstract Color getColor(Class<? extends Color> clazz);
    abstract Shape getShape(Class<? extends Shape> clazz);

}
