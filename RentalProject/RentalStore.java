import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class RentalStore {
  private List<Movie> movies = new ArrayList<Movie>();
  private List<Customer> customers = new ArrayList<Customer>();

  public void register(Customer customer) {
    customers.add(customer);
  }
 
  public void addMovie(Movie movie) {
    movies.add(movie);
  }

  public void removeMovie(Movie movie) {
    for (Movie m : movies) {
      if (movie.getId() == m.getId()) {
        movies.remove(movie);
        for (Customer customer : customers) {
          for (int j = 0; j < customer.getRentals().size(); j++) {
            if (customer.getRentals().get(j).getMovie().equals(movie)) {
              customer.getRentals().remove(j);
            }
          }
        }
      }
    }

  }

  public List<Movie> getAvailableMovies() {
    return movies;
  }

  public List<Customer> getCustomers() {
    return customers;
  }

  public void rentMovie(Movie movie, Customer customer) {
    int id = Integer.parseInt(movie.getId() + "" + customer.getId());
    Rental rent = new Rental(movie, customer, id);
    customer.getRentals().add(rent);
  }

  public void returnMovie(Rental rental) {
    for (Customer customer : customers) {
      for (int j = 0; j < customer.getRentals().size(); j++) {
        if (customer.getRentals().get(j).getId() == rental.getId()) {
          rental.setReturnDate(new Date());
          rental.getMovie().setAvailable(true);
          customer.getRentals().remove(j);
        }
      }
    }

  }

  public Customer getCustomerById(int id) {
    for (Customer customer : customers) {
      if (customer.getId() == id) {
        return customer;
      }
    }
    return null;
  }

  public Movie getmovieById(int id) {
    for (Movie movie : movies) {
      if (movie.getId() == id) {
        return movie;
      }
    }
    return null;
  }

}
