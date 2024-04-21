package decorator;

import models.Car;

public class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", GPS";
    }

    @Override
    public double getCost() {
        return super.getCost() + 500000;
    }
}
