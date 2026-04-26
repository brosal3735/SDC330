public class Car extends Vehicle {


    private int numDoors;
    private boolean isElectric;


    public Car(int id, String make, String model, String color, int numDoors, boolean isElectric) {
        super(id, make, model, color);
        this.numDoors = numDoors;
        this.isElectric = isElectric;
    }


    @Override
    public String displayInfo() {
        return "Car ID: " + getVehicleId() +
               "\nMake: " + getMake() +
               "\nModel: " + getModel() +
               "\nColor: " + getColor() +
               "\nDoors: " + numDoors +
               "\nElectric: " + isElectric + "\n";
    }
}
