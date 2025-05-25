package pillarsofoop.polymorphism.shapes;

public class Circle implements Shapes {

    private double pie = 3.14;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }
    
    public double getPie(){
        return pie;
    }

    public double getRadius(){
        return radius;
    }
    
    @Override
    public double calculateArea() {
        return pie*getRadius()*getRadius();
    }
}