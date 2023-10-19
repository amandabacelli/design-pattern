package br.com.amandabacelli.builder.builders;

import br.com.amandabacelli.builder.components.CarType;
import br.com.amandabacelli.builder.components.Color;
import br.com.amandabacelli.builder.components.Engine;
import br.com.amandabacelli.builder.components.Transmission;

public interface IBuilder {

    void setCarType(CarType type);
    void setSeats(int seats);
    void setTransmission(Transmission transmission);
    void setEngine(Engine engine);
    void setColor(Color color);
}
