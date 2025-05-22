package composition;

public class Car {
    private final Engine engine;  // Car *has* an Engine

    // Constructor takes an Engine object and assigns it
    public Car(Engine engine) {
        this.engine = engine;
    }

    public void startCar() {
        engine.start();  // Car uses its Engine to start
    }
}

