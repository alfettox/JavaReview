package View;

import DAO.DAO;
import DTO.Movie;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ViewIntImpl implements ViewInt {
    private UserIO io;
    private DAO dao;

    // Constructor for dependency injection
    public ViewIntImpl(UserIO io) {
        this.io = io;
    }
    @Override
    public void addDvd(Movie movie) {
        displayBanner("ADD DVD");

        String title = io.readString("Enter the movie title: ");
        Date releaseDate = readValidDate("Enter the date (yyyy-MM-dd): ");
        String string = readValidMPAARating("Enter MPAA rating (G, PG, PG13, R, UNKNOWN): ");
        String director = io.readString("Enter the full director name");
        String studio = io.readString("Enter the studio name");
        int userRating = io.readInt("Enter the user rating (1-10)");

        Movie m = new Movie(title);
        m.setReleaseDate(releaseDate);
        m.setMpaaRating(string);
        m.setDirector(director);
        m.setStudio(studio);
        m.setUserRating(userRating);

        try {
            dao.addMovie(title, m);
        } catch (Exception e) {
            displayError("An unexpected error occurred.");
        }
    }

    private Date readValidDate(String prompt) {
        while (true) {
            try {
                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                String dateString = io.readString(prompt);
                System.out.println("Input Date: " + dateString);  // Print the input date
                return dateFormat.parse(dateString);
            } catch (ParseException e) {
                displayError("Error parsing the date. Please enter a valid date in the format yyyy-MM-dd.");
            }
        }
    }

    private String readValidMPAARating(String prompt) {
        while (true) {
            try {
                String ratingInput = io.readString(prompt).toUpperCase();
                System.out.println("Input MPAA Rating: " + ratingInput);  // Print the input rating
                return ratingInput;
            } catch (IllegalArgumentException e) {
                displayError("Invalid MPAA rating. Please enter a valid rating (G, PG, PG13, R, UNKNOWN).");
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

    public void displayBanner(String str) {
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
    public void displayInfo(Movie movie) {
        // TODO: Implement displayInfo logic
    }

    public void displayNotFound(String title) {
        // TODO: Implement displayNotFound logic
    }

    @Override
    public void displayExitMessage() {

    }

    @Override
    public void displayInvalidInput() {

    }

    @Override
    public UserIO getUserIO() {
        return io;
    }

    public void displayError(String message) {
        io.print(message);
    }

    @Override
    public int displayMenu() {
        io.print("MOVIE DATABASE");
        io.print("1. Add a DVD ");
        io.print("2. Remove a DVD ");
        io.print("3. Edit a DVD ");
        io.print("4. List DVD collection");
        io.print("5. Display the information for a particular DVD");
        io.print("6. Search for a DVD by title");
        io.print("7. Load from persistent storage");
        io.print("8. Save to persistent storage");
        io.print("9. Quit");

        return io.readInt("Please enter your selection number", 1,9);

    }


}
