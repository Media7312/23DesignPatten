package FactoryPattern;

/**
 * @Author: Media7312
 * @Description: Circle 类
 * @Date: Created in 21:11 2018/1/8
 */
public class Circle implements Shape{
    public Circle() {
        System.out.println("这是一个Circle类");
    }

    @Override
    public void draw() {
        System.out.println("Circle");

    }
}
