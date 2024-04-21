package decorator;

import models.Car;

public class NavigationSystem extends CarDecorator {
    public NavigationSystem(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public String getDescription() {
        return super.getDescription() + ", Navigation";
    }

    @Override
    public double getCost() {
        return super.getCost() + 2000.0;
    }
}
