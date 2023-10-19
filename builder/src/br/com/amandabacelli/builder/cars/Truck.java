package br.com.amandabacelli.builder.cars;

import br.com.amandabacelli.builder.components.CarType;
import br.com.amandabacelli.builder.components.Engine;
import br.com.amandabacelli.builder.components.Transmission;

public class Truck {
    private final CarType carType;
    private final int seats;
    private final Engine engine;
    private final Transmission transmission;

    public Truck(CarType carType,
                 int seats,
                 Engine engine,
                 Transmission transmission) {
        this.carType = carType;
        this.seats = seats;
        this.engine = engine;
        this.transmission = transmission;
    }

    public String result() {
        String truck = "Truck with motor: " + engine.getPower() + "\n";
        truck += "Transmission: " + transmission + "\n";

        return truck;
    }
}
