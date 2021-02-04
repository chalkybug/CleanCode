package car.model;

import car.interfaces.Engine;

public class GasEngine implements Engine {
    @Override
    public String run() {
        return "GasEngine";
    }
}
