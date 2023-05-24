package org.example;

import java.util.ArrayList;
 
public class Customer {

    private String name, email, phone, address;
    private int id;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();
 
    public Customer(String name, String email, String phone, String address, int id) {
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

    public ArrayList<Rental> getRentals() {
        return rentals;
    }

}
