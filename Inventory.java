import java.util.ArrayList;


public class Inventory {


    private ArrayList<Vehicle> vehicles = new ArrayList<>();


    public void addVehicle(Vehicle v) {
        vehicles.add(v);
    }


    public void displayInventory() {
        for (Vehicle v : vehicles) {
            System.out.println(v.displayInfo());
        }
    }
}
