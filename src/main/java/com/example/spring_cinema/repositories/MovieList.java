package com.example.spring_cinema.repositories;

import com.example.spring_cinema.models.Movie;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
@Service
public class MovieList {

    private List<Movie> movies;

    public MovieList(){
        this.movies = Arrays.asList(new Movie("Alien", "12", 117),
        new Movie("The Imitation Game", "12A", 124),
       new Movie("Guardians of the Galaxy", "12A", 121)
        );
    }

    public Movie createNewMovie(){
        Random random = new Random();
        int randomIndex = random.nextInt(this.movies.size());
        return this.movies.get(randomIndex);
    }

    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }
}
