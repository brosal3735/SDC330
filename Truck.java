public class Truck extends Vehicle {


    private double cargoCapacity;
    private double towingCapacity;


    public Truck(int id, String make, String model, String color,
                 double cargoCapacity, double towingCapacity) {
        super(id, make, model, color);
        this.cargoCapacity = cargoCapacity;
        this.towingCapacity = towingCapacity;
    }


    @Override
    public String displayInfo() {
        return "Truck ID: " + getVehicleId() +
               "\nMake: " + getMake() +
               "\nModel: " + getModel() +
               "\nCargo Capacity: " + cargoCapacity +
               "\nTowing Capacity: " + towingCapacity + "\n";
    }
}

