public class ServiceRecord {


    private Vehicle vehicle;
    private Customer customer;
    private String serviceDescription;


    public ServiceRecord(Vehicle vehicle, Customer customer, String description) {
        this.vehicle = vehicle;
        this.customer = customer;
        this.serviceDescription = description;
    }


    @Override
    public String toString() {
        return "Service Record\n" +
               "Customer: " + customer.getName() +
               "\nVehicle ID: " + vehicle.getVehicleId() +
               "\nService: " + serviceDescription + "\n";
    }
}
