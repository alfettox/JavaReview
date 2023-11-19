package DAO;

import DTO.Movie;

import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class DAOFileImpl implements DAO {
    private final String MOVIEDB;
//    private static final String FILE_PATH = "moviedb.txt";
    private Map<String, Movie> movieMap = new HashMap<>();

    public DAOFileImpl(){
        MOVIEDB = "moviedb.txt";
    }

    public DAOFileImpl(String moviedb) {
        MOVIEDB = moviedb;
    }


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

    @Override
    public List<Movie> loadPersist(){
        List<Movie> movieList = new ArrayList<>();

        try{
            BufferedReader br = new BufferedReader(new FileReader(FILE_PATH));
        } catch (FileNotFoundException e){
            System.out.println("FILE NOT FOUND");
            e.getMessage();
        }

        return movieList;
    }

    @Override
    public void savePersist(List<Movie> movies) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(FILE_PATH))) {
            for (Movie movie : movies) {
                writer.write(movie.toString());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
