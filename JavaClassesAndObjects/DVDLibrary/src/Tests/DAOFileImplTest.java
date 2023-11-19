
import DAO.DAOFileImpl;
import DTO.Movie;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.FileWriter;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DAOFileImplTest {

    DAOFileImpl testDao;

    @BeforeEach
    public void setUp() throws Exception {
        String testFile = "testroster.txt";
        try (FileWriter writer = new FileWriter(testFile)) {
            writer.write("");
        }
        testDao = new DAOFileImpl(testFile);
    }

    @Test
    void addMovie() throws Exception {
        String title = "new DVD";
        Movie movie = new Movie(title);
        movie.setDirector("DIRECTOR");
        movie.setStudio("STUDIO");
        movie.setReleaseDate("RELEASEDATE");
        movie.setUserRating(9);
        movie.setMpaaRating("PG");

        testDao.addMovie(title, movie);

        Movie retrievedMovie = testDao.getMovie(title);

        assertEquals(movie.getTitle(), retrievedMovie.getTitle(), "Compare movie titles");
        assertEquals(movie.getDirector(), retrievedMovie.getDirector(), "Compare directors");
        assertEquals(movie.getStudio(), retrievedMovie.getStudio(), "Compare studios");
    }

    @Test
    void getAllMovies() {
        Movie m1 = new Movie("This is a test movie 1 ");
        Movie m2 = new Movie("This is a test movie 2");

        testDao.addMovie("title1", m1);
        testDao.addMovie("title2", m2);

        assertEquals(2, testDao.getAllMovies().size(), "Expected size is 2");
    }

    @Test
    void getMovie() {
    }

    @Test
    void removeMovie() {
    }

    @Test
    void loadPersist() {
    }

    @Test
    void savePersist() {
    }
}
