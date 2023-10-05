package com.amandabacelli.design.pattern.factory.vehicles;

public class Motorcycle implements iVehicle {

  @Override
  public void startRoute() {
    getCargo();
    System.out.println("iniciando a entrega - moto");
  }

  @Override
  public void getCargo() {
    System.out.println("Já pegamos a encomenda");
  }
}
