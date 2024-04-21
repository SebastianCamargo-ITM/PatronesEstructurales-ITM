package builder;

import java.text.NumberFormat;
import java.util.Locale;

import models.Car;

public class CarDescriptionBuilder {
    public static String buildDescription(Car car) {
        StringBuilder description = new StringBuilder(car.getDescription());
        description.append(" Cost: ");
        NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(Locale.US);
        description.append(currencyFormat.format(car.getCost()));
        return description.toString();
    }
}
