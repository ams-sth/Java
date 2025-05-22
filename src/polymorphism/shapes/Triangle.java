package polymorphism.shapes;

public class Triangle implements Shapes {

    private double length;
    private double breadth;

    public Triangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public double getLength(){
        return length;
    }

    public double getBreadth(){
        return breadth;
    }

    @Override
    public double calculateArea(){
        return 0.5*getLength()*getBreadth();
    }
    
}