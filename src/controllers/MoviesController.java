package controllers;

import interfaces.MoviesRepository;
import models.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;


public class MoviesController implements MoviesRepository {
    private List<Movie> movies = new ArrayList<>();

    @Override
    public boolean create(String name, String author, String releaseDate) {
        try {
            Movie movie = new Movie();
            movie.setId(UUID.randomUUID().toString());
            movie.setName(name);
            movie.setAuthor(author);
            movie.setReleaseDate(new SimpleDateFormat("dd/MM/yyyy").parse(releaseDate));
            movie.setUpdatedAt(new Date());
            movies.add(movie);
            return true;
        }catch (ParseException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(String id, String name, String author, String releaseDate) {
        return false;
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<Movie> allMovies() {
        return null;
    }
}
