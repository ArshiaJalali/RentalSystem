package org.example;

import java.util.ArrayList;
import java.util.List;
 
public class AllModule {
     
    List<Movie> movies = new ArrayList<>();
    List<Book> books = new ArrayList<>();
    List<Game> games = new ArrayList<>();

    List<Customer> customers = new ArrayList<>();
    public List<Movie> getMovies() {
        return movies;
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Game> getGames() {
        return games;
    }

    public List<Customer> getCustomers() {
        return customers;
    }
}