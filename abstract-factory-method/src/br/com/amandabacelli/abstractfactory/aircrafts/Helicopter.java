package br.com.amandabacelli.abstractfactory.aircrafts;

public class Helicopter implements IAircraft {

    @Override
    public void startRoute() {
        wind();
        getCargo();
        System.out.println("Iniciando a decolagem");
    }

    @Override
    public void getCargo() {
        System.out.println("passageiros ok, ligando hélices");
    }

    @Override
    public void wind() {
        System.out.println("ventos a 25km, ventos ok");
    }
}
