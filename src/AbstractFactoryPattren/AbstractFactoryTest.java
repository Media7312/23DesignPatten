package AbstractFactoryPattren;

/**
 * @Author: Media7312
 * @Description:
 * @Date: Created in 22:37 2018/1/8
 */
public class AbstractFactoryTest {
    public static void main(String[] args) {
         /**
          * 创建形状工厂
          * 根据类创建对象
          */
        AbstractFactory shapeFactory;
        shapeFactory = FactoryProducer.getFactory("SHAPE");
        Shape shape = shapeFactory.getShape(Circle.class);
        shape.draw();
        /**
         * 创建颜色工厂
         * 根据类创建对象
         */
        AbstractFactory colorFactory;
        colorFactory = FactoryProducer.getFactory("COLOR");
        Color color = colorFactory.getColor(Red.class);
        color.fill();

    }
}
