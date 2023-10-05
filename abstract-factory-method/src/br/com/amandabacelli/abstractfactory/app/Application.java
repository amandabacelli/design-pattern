package br.com.amandabacelli.abstractfactory.app;

import br.com.amandabacelli.abstractfactory.aircrafts.IAircraft;
import br.com.amandabacelli.abstractfactory.factories.ITransportFactory;
import br.com.amandabacelli.abstractfactory.landVehicles.ILandVehicle;

public class Application {

    private ILandVehicle vehicle;
    private IAircraft aircraft;

    public Application(ITransportFactory factory) {
        vehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public void startRout() {
        vehicle.startRoute();
        aircraft.startRoute();
    }
}
