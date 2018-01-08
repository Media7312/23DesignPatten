package FactoryPattern;

/**
 * @Author: Media7312
 * @Description: 用反射机制获取相应类
 * @Date: Created in 21:23 2018/1/8
 */
public class ShapeFactoryReflect {
    private Object object;
    /**
     *
     * @param：Shape子类的Class类 例如：Circle.class
     * @return： 相应Shape类
     * @throws Exception
     */
    public static Object getObject(Class<?extends Shape> clazz){
        Object object = null;
        try {
            object = Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return object;
    }
}
