package pillarsofoop.inheritance.heirarchical.vehicle;

public class Car extends Vehicle {
    private int seatingCapacity;

    public Car(String brand, int maxspeed, int seatingCapacity){
        super(brand, maxspeed);
        this.seatingCapacity = seatingCapacity;
    }

    public int getSeatingCapacity(){
        return seatingCapacity;
    }

    public void playMusic(){
        System.out.println("Playing music in the car");
    }

    public void carDetails(){
        System.out.println("This car can seat " + getSeatingCapacity()+ " people." );
    }


}