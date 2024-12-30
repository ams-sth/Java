public class Rectangle implements Shapes {

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
            this.length=length;
            this.breadth = breadth;
        }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    @Override
    public double calculateArea()  {
        return getLength() * getBreadth();
    }
}