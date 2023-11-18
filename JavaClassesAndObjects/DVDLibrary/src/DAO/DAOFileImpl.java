package DAO;

import DTO.Movie;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DAOFileImpl implements DAO{
    private Map<String, Movie> movieMap = new HashMap<>();


    @Override
    public Movie addMovie(String title, Movie movie) {
        return movieMap.put(title, movie);
    }

    @Override
    public List<Movie> getAllMovies() {
        return new ArrayList<>(movieMap.values());
    }

    public Movie getMovie(String title) {
        return movieMap.entrySet()
                .stream()
                .filter(entry -> entry.getKey().equals(title))
                .map(Entry::getValue)
                .findFirst()
                .orElse(null);
    }

    @Override
    public Movie removeMovie(String title) {
        return movieMap.remove(title);
    }
}
