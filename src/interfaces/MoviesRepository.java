package interfaces;

import models.Movie;

import java.util.List;

public interface MoviesRepository {
    boolean create(String name, int author, String releaseDate);
    boolean update(String id, String name, int author, String releaseDate);
    boolean delete(String id);
    List<Movie> allMovies();
}
