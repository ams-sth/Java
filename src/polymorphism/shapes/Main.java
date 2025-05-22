package polymorphism.shapes;

public class Main {

public static void main(String[] args){
    Circle circle=new Circle(15);
    System.out.println("Area of circle : " + circle.calculateArea());

    Rectangle rectangle = new Rectangle(12, 15);
    System.out.println("Area of rectangle : " + rectangle.calculateArea());

    Triangle triangle = new Triangle(30,25);
    System.out.println("Area of triangle : " + triangle.calculateArea());
    }
}