package br.com.amandabacelli.abstractfactory.SeaVehicle;

public class Boat implements ISeaVehicle {
    @Override
    public void startRoute() {
        getCargo();
        System.out.println("Iniciando a entrega maritma - Barco");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a encomenda");
    }
}
