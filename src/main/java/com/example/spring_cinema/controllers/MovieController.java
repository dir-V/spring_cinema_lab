package com.example.spring_cinema.controllers;

import com.example.spring_cinema.models.Movie;
import jakarta.persistence.Entity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/movie")
public class MovieController {

    @GetMapping
    public ResponseEntity<Movie> getMovie(){
        Movie movie = movieService.getMovie();
        return new ResponseEntity<>(movie, HttpStatus.OK);
    }


}
