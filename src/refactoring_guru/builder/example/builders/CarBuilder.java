package refactoring_guru.builder.example.builders;

import refactoring_guru.builder.example.cars.Car;
import refactoring_guru.builder.example.cars.Type;
import refactoring_guru.builder.example.components.*;

/**
 * EN: Concrete builders implement steps defined in the common interface.
 *
 * RU: Конкретные строители реализуют шаги, объявленные в общем интерфейсе.
 * // 具体生成器类将遵循生成器接口并提供生成步骤的具体实现。你的程序中可能会
 * // 有多个以不同方式实现的生成器变体。
 */
public class CarBuilder implements Builder {
    private Type type;
    // 设置汽车座位的数量。
    private int seats;
    //车辆的传动装置
    private Transmission transmission;
    // 安装指定的引擎。
    private Engine engine;
    // 安装行车电脑。
    private TripComputer tripComputer;
    // 安装全球定位系统。
    private GPSNavigator gpsNavigator;

    @Override
    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    @Override
    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Car getResult() {
        return new Car(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
