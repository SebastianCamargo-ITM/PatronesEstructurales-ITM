import builder.CarDescriptionBuilder;
import decorator.AirBag;
import decorator.AirConditioning;
import decorator.AntiLockBrake;
import decorator.NavigationSystem;
import models.Car;
import models.implementation.BasicCar;

public class App {

    public static void main(String[] args) throws Exception {
        Car basicCar = new BasicCar();

        // Costo de vehiculo Basico sin extras
        System.out.println(CarDescriptionBuilder.buildDescription(basicCar));

        Car carWithAC = new AirConditioning(basicCar);
        Car carWithNav = new NavigationSystem(carWithAC);
        Car carWithABS = new AntiLockBrake(carWithNav);
        Car carWithAB = new AirBag(carWithABS);

        // Costo de vehiculo con Aire Acondicionado
        System.out.println(CarDescriptionBuilder.buildDescription(carWithAC));

        // Costo de vehiculo Full Equipo
        System.out.println(CarDescriptionBuilder.buildDescription(carWithAB));

    }
}
