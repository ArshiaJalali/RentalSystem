import java.util.Date;

public class Book extends Item {
    String author, publisher;

    public Book(String title, String genre, Date releaseDate, int id, String author, String publisher) {
        super(title, genre, releaseDate, id);
        this.author = author;
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

}
