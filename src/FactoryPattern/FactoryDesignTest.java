package FactoryPattern;

/**
 * @Author: Media7312
 * @Description: 测试
 * @Date: Created in 21:19 2018/1/8
 */
public class FactoryDesignTest {
    public static void main(String[] args) {
        TestB();

    }
    public static void TestA(){
        Shape shape;
        ShapeFactory shapeFactory = new ShapeFactory();
        shape = shapeFactory.getShape("Circle");
        shape.draw();
        shape = shapeFactory.getShape("Rectangle");
        shape.draw();
    }
     /**
        * 测试ShapeFactoryReflect
        */
    public static void TestB(){
        ShapeFactoryReflect shapeFactoryReflect = new ShapeFactoryReflect();
        Object object;
        object = ShapeFactoryReflect.getObject(Circle.class);

    }
}
