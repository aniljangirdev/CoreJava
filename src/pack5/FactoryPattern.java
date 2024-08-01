package pack5;

public class FactoryPattern {
    public static void main(String[] args) {
        ShapeFactory shapeCircle = new ShapeFactory();
        Shape shape = shapeCircle.getShape(ShapeType.RECTANGLE);
        shape.draw();
    }
}

interface Shape {
    void draw();
}

enum ShapeType{
    CIRCLE,
    RECTANGLE
}



// factory
class ShapeFactory {
    public Shape getShape(ShapeType shapeType) {
        if (shapeType == ShapeType.CIRCLE) {
            return  () -> System.out.println("Draw a Circle!");
        } else if (shapeType == ShapeType.RECTANGLE) {
            return () -> System.out.println("Draw a Rectangle");
        }
        return null;
    }
}

