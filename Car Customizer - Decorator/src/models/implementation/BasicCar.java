package models.implementation;

import models.Car;

public class BasicCar implements Car {
    public String getDescription() {
        return "Basic Car";
    }

    public double getCost() {
        return 15000.0;
    }

}
