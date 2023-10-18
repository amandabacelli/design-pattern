package br.com.amandabacelli.abstractfactory.factories;

import br.com.amandabacelli.abstractfactory.SeaVehicle.Boat;
import br.com.amandabacelli.abstractfactory.SeaVehicle.ISeaVehicle;

public class BoatTransport implements ISeaTransportFactory {

    @Override
    public ISeaVehicle createSeaTransport() {
        return new Boat();
    }
}
