import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String name, email, phone, address;
    private int id;
    private List<Rental> rentals;
  
    public Customer(String name, String email, String phone, String address, int id) {
        rentals = new ArrayList<Rental>();
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPhone() {
        return phone;
    }

    public String getAddress() {
        return address;
    }

    public int getId() {
        return id;
    }

    public List<Rental> getRentals() {
        return rentals;
    }

}
