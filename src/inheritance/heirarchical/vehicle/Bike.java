package inheritance.heirarchical.vehicle;

public class Bike extends Vehicle {
    private String type;

    public Bike(String brand, int maxspeed, String type){
        super(brand, maxspeed);
        this.type = type;
    }

    public String getSports(){
        return type;
    }

    public void performStunt(){
        System.out.println("Performing a stunt on the "+getSports()+ " bike.");
    }
}