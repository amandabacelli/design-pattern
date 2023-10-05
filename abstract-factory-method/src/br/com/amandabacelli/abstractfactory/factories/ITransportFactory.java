package br.com.amandabacelli.abstractfactory.factories;

import br.com.amandabacelli.abstractfactory.aircrafts.IAircraft;
import br.com.amandabacelli.abstractfactory.landVehicles.ILandVehicle;

public interface ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
