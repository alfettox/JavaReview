package View;

import DAO.DAO;
import DTO.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewIntImpl implements ViewInt {
    private UserIO io;
    private DAO dao;

    public ViewIntImpl(UserIO io, DAO dao) {
        this.io = io;
        this.dao = dao;
    }

    @Override
    public void addDvd(Movie movie) {
        displayBanner("ADD DVD");

        String title = io.readString("Enter the movie title: ");
        Date releaseDate = readValidDate("Enter the date (yyyy-MM-dd): ");
        Movie.MPAARating mpaaRating = readValidMPAARating("Enter MPAA rating (G, PG, PG13, R, UNKNOWN): ");
        String director = io.readString("Enter the full director name");
        String studio = io.readString("Enter the studio name");
        int userRating = io.readInt("Enter the user rating (1-10)");

        Movie m = new Movie(title);
        m.setReleaseDate(releaseDate);
        m.setMpaaRating(mpaaRating);
        m.setDirector(director);
        m.setStudio(studio);
        m.setUserRating(userRating);

        // Assuming there's a method like 'addDvd' in the Movie class, update accordingly
        movie.addDvd(m);
    }

    private Date readValidDate(String prompt) {
        while (true) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = io.readString(prompt);
                return dateFormat.parse(dateString);
            } catch (ParseException e) {
                displayError("Invalid date format. Please enter the date in yyyy-MM-dd format.");
            }
        }
    }

    private Movie.MPAARating readValidMPAARating(String prompt) {
        while (true) {
            try {
                return Movie.MPAARating.valueOf(io.readString(prompt).toUpperCase());
            } catch (IllegalArgumentException e) {
                displayError("Invalid MPAA rating. Please enter a valid rating.");
            }
        }
    }

    @Override
    public void savePersist() {
        displayBanner("SAVE TO DISK");
        // TODO: Implement savePersist logic
    }

    @Override
    public void loadPersist() {
        displayBanner("LOAD FROM DISK");
        // TODO: Implement loadPersist logic
    }

    @Override
    public void displayBanner() {
        io.print("===========");
    }

    private void displayBanner(String str) {
        io.print(str);
    }

    @Override
    public void displayDvd() {
        displayBanner("DISPLAY DVD");
        // TODO: Implement displayDvd logic
    }

    @Override
    public void searchDvd() {
        displayBanner("SEARCH DVD");
        String title = io.readString("Enter the exact title");
        Movie retrievedMovie = dao.getMovie(title);
        if (retrievedMovie != null) {
            // Assuming there are displayInfo and displayNotFound methods, update accordingly
            displayInfo(retrievedMovie);
        } else {
            displayNotFound(title);
        }
    }

    @Override
    public void listDvds() {
        displayBanner("LIST ALL DVDs");
        // TODO: Implement listDvds logic
    }

    @Override
    public void editDvd() {
        displayBanner("EDIT DVD");
        // TODO: Implement editDvd logic
    }

    @Override
    public void removeDvd() {
        displayBanner("REMOVE DVD");
        // TODO: Implement removeDvd logic
    }

    // Implement these methods based on your requirements
    private void displayInfo(Movie movie) {
        // TODO: Implement displayInfo logic
    }

    private void displayNotFound(String title) {
        // TODO: Implement displayNotFound logic
    }

    private void displayError(String message) {
        // TODO: Implement displayError logic
    }
}
