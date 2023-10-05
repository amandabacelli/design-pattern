package com.amandabacelli.design.pattern.factory.vehicles;

public class Bike implements iVehicle {

    @Override
    public void startRoute() {
        getCargo();
        System.out.println("iniciando a entrega - bike");
    }

    @Override
    public void getCargo() {
        System.out.println("Pegamos a comida");
    }
}
