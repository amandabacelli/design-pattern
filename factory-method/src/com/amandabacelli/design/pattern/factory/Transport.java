package com.amandabacelli.design.pattern.factory;

import com.amandabacelli.design.pattern.factory.vehicles.iVehicle;

public abstract class Transport {

  void startTransport() {
    iVehicle vehicle = createTransport();
    vehicle.startRoute();
  }

  protected abstract iVehicle createTransport();
}
