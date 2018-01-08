package FactoryPattern;

/**
 * @Author: Media7312
 * @Description: Rectangle
 * @Date: Created in 21:13 2018/1/8
 */
public class Rectangle implements Shape{
    public Rectangle() {
        System.out.println("这是一个Rectangle类");
    }

    @Override
    public void draw() {
        System.out.println("Rectangle");
    }
}
