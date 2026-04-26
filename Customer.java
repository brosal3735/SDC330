public class Customer {


    private int customerId;
    private String name;
    private String phone;


    public Customer(int id, String name, String phone) {
        this.customerId = id;
        this.name = name;
        this.phone = phone;
    }


    public String getName() { return name; }


    @Override
    public String toString() {
        return "Customer ID: " + customerId +
               "\nName: " + name +
               "\nPhone: " + phone + "\n";
    }
}

