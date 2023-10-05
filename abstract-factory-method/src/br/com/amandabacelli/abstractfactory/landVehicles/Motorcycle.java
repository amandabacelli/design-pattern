package br.com.amandabacelli.abstractfactory.landVehicles;

public class Motorcycle implements ILandVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando uma entrega - Moto");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");
    }
}
