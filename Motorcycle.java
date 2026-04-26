public class Motorcycle extends Vehicle {


    private boolean hasSidecar;


    public Motorcycle(int id, String make, String model, String color, boolean hasSidecar) {
        super(id, make, model, color);
        this.hasSidecar = hasSidecar;
    }


    @Override
    public String displayInfo() {
        return "Motorcycle ID: " + getVehicleId() +
               "\nMake: " + getMake() +
               "\nModel: " + getModel() +
               "\nSidecar: " + hasSidecar + "\n";
    }
}
