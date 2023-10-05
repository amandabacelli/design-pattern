package com.amandabacelli.design.pattern.factory;

import com.amandabacelli.design.pattern.factory.vehicles.Bike;
import com.amandabacelli.design.pattern.factory.vehicles.iVehicle;

public class BikeTransport extends Transport {

    @Override
    protected iVehicle createTransport() {
        return new Bike();
    }
}
