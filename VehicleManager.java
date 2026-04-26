import java.util.ArrayList;


public class VehicleManager {


    private ArrayList<Vehicle> vehicles = new ArrayList<>();


    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }


    public void displayAllVehicles() {
        for (Vehicle v : vehicles) {
            System.out.println(v.displayInfo());
        }
    }
}
