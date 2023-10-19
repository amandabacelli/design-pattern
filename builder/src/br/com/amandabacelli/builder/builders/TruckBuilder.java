package br.com.amandabacelli.builder.builders;

import br.com.amandabacelli.builder.cars.Car;
import br.com.amandabacelli.builder.cars.Truck;
import br.com.amandabacelli.builder.components.CarType;
import br.com.amandabacelli.builder.components.Color;
import br.com.amandabacelli.builder.components.Engine;
import br.com.amandabacelli.builder.components.Transmission;

public class TruckBuilder implements IBuilder {

    private CarType carType;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private Color color;

    @Override
    public void setCarType(CarType type) {
        this.carType = type;
    }

    @Override
    public void setSeats(int seats) {
        this.seats = seats;
    }

    @Override
    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    @Override
    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    public Truck getResult() {
        return new Truck(carType, seats, engine, transmission);
    }
}
