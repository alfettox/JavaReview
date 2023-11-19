package DAO;

import DTO.Movie;

import java.util.List;

public interface DAO {

    Movie addMovie(String title, Movie movie);

    List<Movie> getAllMovies();

    Movie getMovie(String title);

    Movie removeMovie(String title);

    List<Movie> loadPersist();

    void savePersist(List<Movie> movies);
}
