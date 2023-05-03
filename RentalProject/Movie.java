import java.util.Date;

public class Movie {
    private String title, genre, director, cast;
    private Date releaseDate;
    private int id;
    private boolean available = true;

    public Movie(String title, String genre, String director, String cast, Date releaseDate, int id) {
        this.title = title;
        this.genre = genre;
        this.director = director;
        this.cast = cast;
        this.releaseDate = releaseDate;
        this.id = id;
    }

    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
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
    public boolean isAvailable(){
        return available;
    }
    public void setAvailable(boolean available){
        this.available = available;
    }
}
