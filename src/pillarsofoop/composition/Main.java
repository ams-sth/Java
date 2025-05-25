package pillarsofoop.composition;

class Main {
    public static void main(String[] args) {
        // var myEngine = new Engine(); // Create an Engine object
        var myCar = new Car(new Engine()); // Pass the Engine to Car (composition)
        myCar.startCar(); // Car starts using its Engine
    }
}
