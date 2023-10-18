package br.com.amandabacelli.abstractfactory.app;

import br.com.amandabacelli.abstractfactory.SeaVehicle.ISeaVehicle;
import br.com.amandabacelli.abstractfactory.aircrafts.IAircraft;
import br.com.amandabacelli.abstractfactory.factories.ILandTransportFactory;
import br.com.amandabacelli.abstractfactory.factories.ISeaTransportFactory;
import br.com.amandabacelli.abstractfactory.factories.ITransportFactory;
import br.com.amandabacelli.abstractfactory.factories.IVehicle;
import br.com.amandabacelli.abstractfactory.landVehicles.ILandVehicle;

public class Application {

    private ILandVehicle landVehicle;
    private IAircraft aircraft;

    private ISeaVehicle seaVehicle;

    private final ITransportFactory factory;

    public Application(ILandTransportFactory factory) {
        this.factory = factory;
        landVehicle = factory.createTransportVehicle();
        aircraft = factory.createTransportAircraft();
    }

    public Application(ISeaTransportFactory factory) {
        this.factory = factory;
        seaVehicle = factory.createSeaTransport();
    }

    public void startRout() {
        if (factory instanceof ILandTransportFactory) {
            landVehicle.startRoute();
            aircraft.startRoute();
        } else if (factory instanceof ISeaTransportFactory) {
            seaVehicle.startRoute();
        }
    }
}
