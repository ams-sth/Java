package encapsulation.rectangle;

public class Rectangle {

    private double length;
    private double breadth;

    public void setLength(double l) {
        length = l;
    }

    public void setBreadth(double b) {
        breadth = b;
    }

    public double area() {
        return length * breadth;
    };

    public double perimeter() {
        return 2 * (length + breadth);
    }

    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle();

        rectangleOne.setLength(13);
        rectangleOne.setBreadth(25);

        System.out.println("Area of rectangle is : " + rectangleOne.area());
        System.out.println("Perimeter of rectange is : " + rectangleOne.perimeter());

    }
}
