public class AmphibiousPlane implements AirVehicle, Amphibious {

    @Override
    public void fly() {
        System.out.println("Flying...");
    }

    @Override
    public void dock() {
        System.out.println("Docking...");
    }

    @Override
    public void launch() {
        System.out.println("Launching...");
    }
}

interface AirVehicle {
    void fly();
}

interface Amphibious {
    void dock();

    void launch();
}