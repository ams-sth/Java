package pillarsofoop.inheritance.heirarchical.vehicle;

public class Vehicle {
    private String brand;
    private int maxspeed;

    public Vehicle(String brand, int maxspeed){
        this.brand=brand;
        this.maxspeed=maxspeed;
    } 
    public String getBrand(){
        return brand;
    }
    public int getMaxSpeed(){
        return maxspeed;
    }

    public void start(){
        System.out.println("The "+getBrand()+ " vehicle starts");
    }

    public void displayMaxSpeed(){
        System.out.println("The maximum speed is " + getMaxSpeed() + " km/h." + "\n");
    }
}