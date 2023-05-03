import java.util.Date;

public class Item {
    private String title, genre;
    private Date releaseDate;
    private int id;
    private boolean available = true;
    

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

    public void rentItem(Item item,Customer customer){ 
        RentalStore r = new RentalStore();   
        r.rentItem(item, customer);
    }
 
    public void returnItem(Rental rental){
        RentalStore r = new RentalStore();
        r.returnItem(rental);
    }

}
