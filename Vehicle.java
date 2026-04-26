public abstract class Vehicle {


    private int vehicleId;
    private String make;
    private String model;
    private String color;


    public Vehicle(int vehicleId, String make, String model, String color) {
        this.vehicleId = vehicleId;
        this.make = make;
        this.model = model;
        this.color = color;
    }


    public int getVehicleId() { return vehicleId; }
    public String getMake() { return make; }
    public String getModel() { return model; }
    public String getColor() { return color; }


    public void start() {
        System.out.println("Vehicle starting...");
    }


    public void stop() {
        System.out.println("Vehicle stopping...");
    }


    public abstract String displayInfo();
}

