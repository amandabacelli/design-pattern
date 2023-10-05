package com.amandabacelli.design.pattern.factory.vehicles;

public class Car implements iVehicle {


  @Override
  public void startRoute() {
    getCargo();
    System.out.println("iniciando o trajeto com carro");
  }

  @Override
  public void getCargo() {
    System.out.println("Pegamos os passageiros, estamos prontos.");
  }
}
