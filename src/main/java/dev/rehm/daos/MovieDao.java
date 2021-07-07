package dev.rehm.daos;

import dev.rehm.models.Movie;

import java.util.List;

public interface MovieDao {

    public List<Movie> getAllMovies();
    public boolean addNewMovie(Movie newMovie);

}
