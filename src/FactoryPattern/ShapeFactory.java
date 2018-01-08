package FactoryPattern;

/**
 * @Author: Media7312
 * @Description:
 * @Date: Created in 21:13 2018/1/8
 */
public class ShapeFactory {
    private Shape shape;
     /**
        *
        * @param：Shape类型名称
        * @return： 相应Shape类
        * @throws Exception
        */
    public Shape getShape(String shapeType){
        if ( shapeType == null){
            return null;
        } else if( shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        } else if( shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }
}
