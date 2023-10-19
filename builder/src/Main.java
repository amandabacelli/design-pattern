import br.com.amandabacelli.builder.builders.CarBuilder;
import br.com.amandabacelli.builder.builders.TruckBuilder;
import br.com.amandabacelli.builder.cars.Car;
import br.com.amandabacelli.builder.cars.Truck;
import br.com.amandabacelli.builder.director.Director;

public class Main {
    public static void main(String[] args) {
        Director director = new Director();
        CarBuilder builder = new CarBuilder();

        director.constructSedanCar(builder);
        Car car = builder.getResult();

        System.out.println("car: " + car.result());

        TruckBuilder truckBuilder = new TruckBuilder();
        director.constructTruck(truckBuilder);

        Truck truck = truckBuilder.getResult();

        System.out.println("truck: " + truck.result());

        CarBuilder sportBuilder = new CarBuilder();
        director.constructSportCar(sportBuilder);

        System.out.println("car: " + sportBuilder.getResult().result());
    }
}
