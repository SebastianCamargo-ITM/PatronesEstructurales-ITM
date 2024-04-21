import builder.CarDescriptionBuilder;
import decorator.AirConditioning;
import decorator.NavigationSystem;
import models.Car;
import models.implementation.BasicCar;

public class App {

    public static void main(String[] args) throws Exception {
        Car basicCar = new BasicCar();
        Car carWithAC = new AirConditioning(basicCar);
        Car carWithNav = new NavigationSystem(carWithAC);

        System.out.println(CarDescriptionBuilder.buildDescription(carWithNav));
    }
}
