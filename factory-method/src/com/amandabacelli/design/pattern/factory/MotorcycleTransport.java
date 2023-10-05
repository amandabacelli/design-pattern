package com.amandabacelli.design.pattern.factory;

import com.amandabacelli.design.pattern.factory.vehicles.Motorcycle;
import com.amandabacelli.design.pattern.factory.vehicles.iVehicle;

public class MotorcycleTransport extends Transport {
  @Override
  protected iVehicle createTransport() {
    return new Motorcycle();
  }
}
