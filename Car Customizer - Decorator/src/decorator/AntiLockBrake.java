package decorator;

import models.Car;

public class AntiLockBrake extends CarDecorator {

    public AntiLockBrake(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", ABS";
    }

    @Override
    public double getCost() {
        return super.getCost() + 850000;
    }
}
