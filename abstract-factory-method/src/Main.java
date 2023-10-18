import br.com.amandabacelli.abstractfactory.app.Application;
import br.com.amandabacelli.abstractfactory.factories.*;

public class Main {
    public static Application configureApplication() {
        ITransportFactory factory;

        String company = "boat";
        if(company == "boat") {
            factory = new BoatTransport();
            return new Application((ISeaTransportFactory) factory);
        } else if (company == "uber") {
            factory = new UberLandTransport();
        } else {
            factory = new NineNineTransport();
        }
        return new Application((ILandTransportFactory) factory);
    }
    public static void main(String[] args) {
        Application app = configureApplication();
        app.startRout();
    }
}
