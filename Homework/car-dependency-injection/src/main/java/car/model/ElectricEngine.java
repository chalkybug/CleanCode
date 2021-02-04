package car.model;

import car.interfaces.Engine;

public class ElectricEngine implements Engine {
    @Override
    public String run() {
        return "ElectricEngine";
    }

}
