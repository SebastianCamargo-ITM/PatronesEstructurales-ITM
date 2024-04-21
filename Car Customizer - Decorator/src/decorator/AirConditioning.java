package decorator;

import models.Car;

public class AirConditioning extends CarDecorator {

    public AirConditioning(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Air Conditioning";
    }

    @Override
    public double getCost() {
        return super.getCost() + 800000;
    }
}
