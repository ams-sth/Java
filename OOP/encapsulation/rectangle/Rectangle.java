package OOP.encapsulation.rectangle;

public class Rectangle {

    private double length;
    private double breadth;

    Rectangle(double len, double bre) {
        length = len;
        breadth = bre;

    };

    public double area() {
        return length * breadth;
    };

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(10, 15);

        System.out.println("Area of rectangle is : " + rectangleOne.area());
        System.out.println("Perimeter of rectange is : " + rectangleOne.perimeter());

    }
}
