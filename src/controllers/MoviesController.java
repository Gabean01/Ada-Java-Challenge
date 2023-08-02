package controllers;

import interfaces.MoviesRepository;
import models.Movie;
import utils.Utils;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicBoolean;


public class MoviesController implements MoviesRepository {
    private List<Movie> movies = new ArrayList<>();

    @Override
    public boolean create(String name, String author, String releaseDate) {
        try {
            Movie movie = new Movie();
            movie.setId(UUID.randomUUID().toString().split("-")[0]);
            movie.setName(name);
            movie.setAuthor(author);
            movie.setReleaseDate(Utils.convertStringDateToDate(releaseDate));
            movie.setUpdatedAt(new Date());
            movie.setCreatedAt(new Date());
            movies.add(movie);
            return true;
        }catch (ParseException e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(String id, String name, String author, String releaseDate) {
        AtomicBoolean isMovieSaved = new AtomicBoolean(false);

        movies.forEach(movie -> {
            if (movie.getId().equals(id)){
                isMovieSaved.set(true);

                if (!name.isEmpty())
                    movie.setName(name);
                if (!author.isEmpty())
                    movie.setAuthor(author);
                if (!releaseDate.isEmpty()) {
                    try {
                        movie.setReleaseDate(Utils.convertStringDateToDate(releaseDate));
                    } catch (ParseException e) {
                        e.printStackTrace();
                        System.out.println("Could not change release date because it is not in the correct format");
                    }
                }
                movie.setUpdatedAt(new Date());
            }
        });
        return isMovieSaved.get();
    }

    @Override
    public boolean delete(String id) {
        return false;
    }

    @Override
    public List<Movie> allMovies() {
        return movies;
    }
}
