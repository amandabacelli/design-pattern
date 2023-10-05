package com.amandabacelli.design.pattern.factory;

import com.amandabacelli.design.pattern.factory.vehicles.Car;
import com.amandabacelli.design.pattern.factory.vehicles.iVehicle;

public class CarTransport extends Transport {

  @Override
  protected iVehicle createTransport() {
    return new Car();
  }
}
