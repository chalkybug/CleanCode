package car.model;

import car.interfaces.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Car {
    @Autowired
    @Qualifier("gasEngine")
    private Engine engine;

    private Steering steering;

    public Car(Steering steering) {
        this.steering = steering;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine.toString() + ", steering=" + steering.getModel() + "]";
    }
}
