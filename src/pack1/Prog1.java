package pack1;

public class Prog1 {
    public static void main(String[] args) {
        Shape circleShape = new CircleShape(10);
        Shape rectangleShape = new RectangleShape(10, 10);

        circleShape.displayArea();
        rectangleShape.displayArea();

        IShape circleArea = radios -> Math.PI * radios * radios;
        double circle = circleArea.calculateArea(10);
        System.out.println(circle);
    }
}

class CircleShape extends Shape {

    private final double radius;

    CircleShape(double val) {
        this.radius = val;
    }

    @Override
    void message() {
        super.message();
    }

    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class RectangleShape extends Shape {

    private final double length;
    private final double width;

    public RectangleShape(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    double calculateArea() {
        return length * width;
    }
}


