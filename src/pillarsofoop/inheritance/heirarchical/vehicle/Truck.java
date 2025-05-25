package pillarsofoop.inheritance.heirarchical.vehicle;

public class Truck extends Vehicle {
    private int loadCapacity;
    private boolean trailerAttached;

    public Truck(String brand, int maxspeed, int loadCapacity, boolean trailerAttached){
        super(brand, maxspeed);
        this.loadCapacity = loadCapacity;
        this.trailerAttached = trailerAttached;
    }

    public int getLoadCapacity(){
        return loadCapacity;
    }

    public boolean getTrailerAttached(){
        return trailerAttached;
    }

    public void haul(){
        System.out.println("Hauling " + getLoadCapacity()+ " tons.");
    }

    public void attachTrailer(){
        if(trailerAttached){
            System.out.println("Trailer attached ");
        }
        else {
        System.out.println("No trailer for hauling");
        }
    }

}