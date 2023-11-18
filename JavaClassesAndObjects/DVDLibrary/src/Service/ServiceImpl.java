package Service;

import DAO.DAO;
import DAO.DAOFileImpl;
import DTO.Movie;
import View.UserIO;
import View.UserIOConsoleImpl;
import View.View;

import java.util.Date;

public class ServiceImpl implements Service{
    UserIO io = new UserIOConsoleImpl();
    View v = new View();
    DAO dao = new DAOFileImpl();

    @Override
    public void addDvd() {
        v.displayBanner("ADD DVD");

        String title = io.readString("Enter the movie title: ");
        Date releaseDate = io.readDate("Enter the date");
        Movie.MPAARating mpaaRating = Movie.MPAARating.valueOf(io.readString("Enter MPAA rating (G, PG, PG13, R, UNKNOWN"));
        String director = io.readString("Enter the full director name");
        String studio = io.readString("Enter the studio name");
        int userRating = io.readInt("Enter the user rating (1-10)");

        Movie m = new Movie("title");
        m.setReleaseDate(releaseDate);
        m.setMpaaRating(mpaaRating);
        m.setDirector(director);
        m.setStudio(studio);
        m.setUserRating(userRating);

        dao.addMovie(title, m);
    }

    @Override
    public void savePersist() {
        v.displayBanner("SAVE TO DISK");

    }

    @Override
    public void loadPersist() {
        v.displayBanner("LOAD FROM DISK");

    }

    @Override
    public void displayDvd() {
        v.displayBanner("DISPLAY DVD");

    }

    @Override
    public void searchDvd() {
        v.displayBanner("SEARCH DVD");
        String title = io.readString("Enter the exact title");
        Movie retrievedMovie = dao.getMovie(title);
        if (retrievedMovie != null){
            v.displayInfo(retrievedMovie);
        } else {
            v.displayNotFound(title);
        }
    }

    @Override
    public void listDvds() {
        v.displayBanner("LIST ALL DVDs");

    }

    @Override
    public void editDvd() {
        v.displayBanner("EDIT DVD");

    }

    @Override
    public void removeDvd() {
        v.displayBanner("REMOVE DVD");

    }
}
