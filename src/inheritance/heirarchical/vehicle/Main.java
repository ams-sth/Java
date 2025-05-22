package inheritance.heirarchical.vehicle;

public class Main {
    public static void main(String[] args){
        Car car = new Car("Honda", 130, 5);
        car.start();
        car.carDetails();
        car.displayMaxSpeed();
        car.playMusic();
        
        
        Truck truck = new Truck("Volvo", 100, 12, true);
        truck.start();
        truck.haul();
        truck.attachTrailer();
        truck.displayMaxSpeed();

        Bike bike = new Bike("Royal Enfield", 200, "Sports" );
        bike.start();
        bike.performStunt();
        bike.displayMaxSpeed();

    }
}