package org.example;
import java.util.Date;

public class Game extends Item {
    String platform, publisher;

    public Game(String title, String genre, Date releaseDate, int id, String platform,String publisher) {
        super(title, genre, releaseDate, id);
        this.platform = platform;
        this.publisher = publisher;
    }

    public String getPlatform() {
        return platform;
    }

    public String getPublisher() {
        return publisher;
    }

}
