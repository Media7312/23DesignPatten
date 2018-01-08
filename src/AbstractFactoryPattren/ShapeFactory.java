package AbstractFactoryPattren;

/**
 * @Author: Media7312
 * @Description: 获得Shape对象
 * @Date: Created in 22:08 2018/1/8
 */
public class ShapeFactory extends AbstractFactory{
    @Override
    Color getColor(Class<? extends Color> clazz) {
        return null;
    }

    @Override
    Shape getShape(Class<? extends Shape> clazz) {
        Shape shape = null;
        try {
            shape = (Shape) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return shape;
    }
}
