public class App {


    public static void main(String[] args) {


        System.out.println("Broc Salvati - Week 3 Project Implementation\n");


        VehicleManager manager = new VehicleManager();
        Inventory inventory = new Inventory();


        Vehicle car = new Car(1, "Toyota", "Camry", "Black", 4, false);
        Vehicle truck = new Truck(2, "Ford", "F-150", "Blue", 2000, 5000);
        Vehicle bike = new Motorcycle(3, "Harley", "Sportster", "Red", false);


        manager.addVehicle(car);
        manager.addVehicle(truck);
        manager.addVehicle(bike);


        inventory.addVehicle(car);
        inventory.addVehicle(truck);


        Customer customer = new Customer(1, "John Doe", "555-1234");
        ServiceRecord record = new ServiceRecord(car, customer, "Oil Change");


        System.out.println("=== All Vehicles ===");
        manager.displayAllVehicles();


        System.out.println("=== Inventory ===");
        inventory.displayInventory();


        System.out.println("=== Service Record ===");
        System.out.println(record);
    }
}
