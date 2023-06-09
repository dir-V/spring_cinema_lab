package com.example.spring_cinema.services;

import com.example.spring_cinema.models.Movie;
import com.example.spring_cinema.repositories.MovieList;
import com.example.spring_cinema.repositories.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    @Autowired
    MovieList movieList;

    public MovieService(){

    }

    public Movie createNewMovie() {
        return movieList.createNewMovie();
    }

    public List<Movie> getAllMovies(){
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovieId(int Id){
        return movieRepository.findById(Id);
    }
}
