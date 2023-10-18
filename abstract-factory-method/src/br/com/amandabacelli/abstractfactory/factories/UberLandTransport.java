package br.com.amandabacelli.abstractfactory.factories;

import br.com.amandabacelli.abstractfactory.aircrafts.Airplane;
import br.com.amandabacelli.abstractfactory.aircrafts.IAircraft;
import br.com.amandabacelli.abstractfactory.landVehicles.Car;
import br.com.amandabacelli.abstractfactory.landVehicles.ILandVehicle;

public class UberLandTransport implements ILandTransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Car();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Airplane();
    }
}
