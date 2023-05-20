import java.util.Date;

public class Movie extends Item {
    private String director, cast;

    public Movie(String title, String genre, String director, String cast, Date releaseDate, int id) {
        super(title, genre, releaseDate, id);
        this.director = director;
        this.cast = cast;
     
    }
 
    public String getDirector() {
        return director;
    }

    public String getCast() {
        return cast;
    }

   
}
