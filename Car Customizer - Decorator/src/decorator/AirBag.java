package decorator;

import models.Car;

public class AirBag extends CarDecorator{

    public AirBag(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", AirBag";
    }

    @Override
    public double getCost() {
        return super.getCost() + 1200000;
    }
}
