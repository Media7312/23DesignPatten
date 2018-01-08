package AbstractFactoryPattren;

/**
 * @Author: Media7312
 * @Description: 工厂生成器，通过传递形状或颜色信息获取工厂(choice)
 * @Date: Created in 22:15 2018/1/8
 */
public class FactoryProducer {
    public static AbstractFactory getFactory(String choice){
        AbstractFactory abstractFactory = null;
        if (choice.equalsIgnoreCase("COLOR")){
            return new ColorFactory();
        } else if (choice.equalsIgnoreCase("SHAPE") ){
            return new ShapeFactory();
        }

        return abstractFactory;
    }
}
