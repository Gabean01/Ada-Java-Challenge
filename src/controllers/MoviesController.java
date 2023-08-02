package controllers;

import interfaces.MoviesRepository;
import models.Movie;

import java.util.ArrayList;
import java.util.List;

public class MoviesController implements MoviesRepository {
    private List<Movie> movies = new ArrayList<>();

    @Override
    public void create(String name, int author) {

    }

    @Override
    public List<Movie> allMovies() {
        return null;
    }
}
