package org.example;

import java.util.Date;

public class Item {
    private String title, genre;
    private Date releaseDate;
    private int id;
    private boolean available = true;
    private RentalStore r = new RentalStore();   
   
    public Item(String title, String genre, Date releaseDate, int id) {
        this.title = title;
        this.genre = genre;
        this.releaseDate = releaseDate;
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public int getId() {
        return id;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void rentItem(Customer customer){ 
        r.rentItem(this, customer);
    }
 
    public void returnItem(Rental rental){
        r.returnItem(rental);
    }

}
