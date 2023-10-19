package br.com.amandabacelli.builder.cars;

import br.com.amandabacelli.builder.components.CarType;
import br.com.amandabacelli.builder.components.Color;
import br.com.amandabacelli.builder.components.Engine;
import br.com.amandabacelli.builder.components.Transmission;

public class Car {

    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;
    private final Color color;

    public Car(CarType carType,
               int seats,
               Engine engine,
               Transmission transmission,
               Color color) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
        this.color = color;
    }

    public CarType getCarType() {
        return carType;
    }

    public int getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public String result() {
        String car = "Car with motor: " + engine.getPower() + "\n";
        car += "Type: " + carType + "\n";
        car += "Transmission: " + transmission + "\n";
        car += "Color: " + color + "\n";

        return car;
    }
}
