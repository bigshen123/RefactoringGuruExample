package refactoring_guru.builder.example.cars;

import refactoring_guru.builder.example.components.*;

/**
 * EN: Car manual is another product. Note that it does not have the same
 * ancestor as a Car. They are not related.
 *
 * RU: Руководство автомобиля — это второй продукт. Заметьте, что руководство и
 * сам автомобиль не имеют общего родительского класса. По сути, они независимы.
 *
 * 用户使用手册应该根据汽车配置进行编制，并介绍汽车的所有功能。
 */
public class Manual {
    private final Type type;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final TripComputer tripComputer;
    private final GPSNavigator gpsNavigator;

    public Manual(Type type, int seats, Engine engine, Transmission transmission,
                  TripComputer tripComputer, GPSNavigator gpsNavigator) {
        this.type = type;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.tripComputer = tripComputer;
        this.gpsNavigator = gpsNavigator;
    }

    public String print() {
        String info = "";
        info += "Type of car: " + type + "\n";
        info += "Count of seats: " + seats + "\n";
        info += "Engine: volume - " + engine.getVolume() + "; mileage - " + engine.getMileage() + "\n";
        info += "Transmission: " + transmission + "\n";
        if (this.tripComputer != null) {
            info += "Trip Computer: Functional" + "\n";
        } else {
            info += "Trip Computer: N/A" + "\n";
        }
        if (this.gpsNavigator != null) {
            info += "GPS Navigator: Functional" + "\n";
        } else {
            info += "GPS Navigator: N/A" + "\n";
        }
        return info;
    }
}
