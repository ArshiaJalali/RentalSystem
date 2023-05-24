package org.example;

import java.util.Date;

public class Rental {
    private Item item;
    private Customer customer;
    private int id;
    private Date rentalDate, returnDate;
 
    public Rental(Item item, Customer customer, int id) {
        this.item = item;
        this.customer = new Customer(customer.getName(),customer.getEmail(),customer.getPhone(),customer.getAddress(),customer.getId());
        this.id = id;
        item.setAvailable(false);
         this.rentalDate = new Date();
    }

    public Customer getCustomer() {
        return customer;
    }

    public int getId() {
        return id;
    }

    public Date getRentalDate() {
        return rentalDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    public Item getItem() {
        return item;
    }

}
