package br.com.amandabacelli.abstractfactory.factories;

import br.com.amandabacelli.abstractfactory.aircrafts.IAircraft;
import br.com.amandabacelli.abstractfactory.landVehicles.ILandVehicle;

public interface ILandTransportFactory extends ITransportFactory {

    ILandVehicle createTransportVehicle();
    IAircraft createTransportAircraft();
}
