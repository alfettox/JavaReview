package Service;

import DAO.DAO;
import DTO.Movie;
import View.ViewInt;
import java.util.Date;
import DAO.DvdLibraryAuditDao;

public class ServiceImpl implements Service {
    private final DvdLibraryAuditDao auditDao;
    private ViewInt view;
    private DAO dao;

    public ServiceImpl(ViewInt view, DAO dao, DvdLibraryAuditDao auditDao) {
        this.view = view;
        this.dao = dao;
        this.auditDao = auditDao;
    }

    @Override
    public void addDvd() {
        view.displayBanner("ADD DVD");

        String title = view.getUserIO().readString("Enter the movie title: ");
        Date releaseDate = view.getUserIO().readDate("Enter the date");
        String string = view.getUserIO().readString("Enter MPAA rating (G, PG, PG13, R, UNKNOWN)");
        String director = view.getUserIO().readString("Enter the full director name");
        String studio = view.getUserIO().readString("Enter the studio name");
        int userRating = view.getUserIO().readInt("Enter the user rating (1-10)");

        Movie m = new Movie(title);
        m.setReleaseDate(releaseDate);
        m.setMpaaRating(string);
        m.setDirector(director);
        m.setStudio(studio);
        m.setUserRating(userRating);

        try {
            dao.addMovie(title, m);
        } catch (Exception e) {
            view.displayError("An unexpected error occurred.");
        }
    }

    @Override
    public void savePersist() {
        view.displayBanner("SAVE TO DISK");
        // TODO: Implement savePersist logic
    }

    @Override
    public void loadPersist() {
        view.displayBanner("LOAD FROM DISK");
        // TODO: Implement loadPersist logic
    }

    @Override
    public void displayDvd() {
        view.displayBanner("DISPLAY DVD");
        // TODO: Implement displayDvd logic
    }

    @Override
    public void searchDvd() {
        view.displayBanner("SEARCH DVD");
        String title = view.getUserIO().readString("Enter the exact title");
        Movie retrievedMovie = dao.getMovie(title);
        if (retrievedMovie != null) {
            view.displayInfo(retrievedMovie);
        } else {
            view.displayNotFound(title);
        }
    }

    @Override
    public void listDvds() {
        view.displayBanner("LIST ALL DVDs");
        // TODO: Implement listDvds logic
    }

    @Override
    public void editDvd() {
        view.displayBanner("EDIT DVD");
        // TODO: Implement editDvd logic
    }

    @Override
    public void removeDvd() {
        view.displayBanner("REMOVE DVD");
        // TODO: Implement removeDvd logic
    }
}