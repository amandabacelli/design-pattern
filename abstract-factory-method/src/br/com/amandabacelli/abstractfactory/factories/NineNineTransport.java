package br.com.amandabacelli.abstractfactory.factories;

import br.com.amandabacelli.abstractfactory.aircrafts.Helicopter;
import br.com.amandabacelli.abstractfactory.aircrafts.IAircraft;
import br.com.amandabacelli.abstractfactory.landVehicles.ILandVehicle;
import br.com.amandabacelli.abstractfactory.landVehicles.Motorcycle;

public class NineNineTransport implements ITransportFactory {

    @Override
    public ILandVehicle createTransportVehicle() {
        return new Motorcycle();
    }

    @Override
    public IAircraft createTransportAircraft() {
        return new Helicopter();
    }
}
