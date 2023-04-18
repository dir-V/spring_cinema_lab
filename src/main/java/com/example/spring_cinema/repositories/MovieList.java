package com.example.spring_cinema.repositories;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
@Service
public class MovieList {

    private List<String> movies;

    public MovieList(){
        this.movies = Arrays.asList(
                "Fast N Furious",
                "Uncharted Movie",
                "Spiderman No Way Home",
                "Avengers Endgame",
                "Pirates of the Caribbean"
        );
    }

    public String createNewMovie(){
        Random random = new Random();
        int randomIndex = random.nextInt(this.movies.size());
        return this.movies.get(randomIndex);
    }
}
