package car.model;

public class Steering {
    private String model;

    public String getModel() {
        return model;
    }

    public Steering(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
