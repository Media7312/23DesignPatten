package AbstractFactoryPattren;

/**
 * @Author: Media7312
 * @Description: 获得Color对象
 * @Date: Created in 22:00 2018/1/8
 */
public class ColorFactory extends AbstractFactory {
    public ColorFactory() {
        super();
    }

    @Override
    Color getColor(Class<? extends Color> clazz) {
        Color object = null;
        try {
            object = (Color) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    @Override
    Shape getShape(Class<? extends Shape> clazz) {
        return null;
    }
}
