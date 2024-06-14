package pack1;

public abstract class Shape {
    abstract double calculateArea();

     void message(){

    }

    void displayArea(){
        System.out.println("Area: "+ calculateArea());
    }
}
