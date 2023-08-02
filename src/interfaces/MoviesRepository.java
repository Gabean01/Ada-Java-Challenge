package interfaces;

import models.Movie;

import java.util.List;

public interface MoviesRepository {
    void create(String name, int author);
    void update
    List<Movie> allMovies();
}
