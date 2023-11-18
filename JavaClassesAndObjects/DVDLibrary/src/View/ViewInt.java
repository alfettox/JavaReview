package View;

import DTO.Movie;

import java.util.Date;

public interface ViewInt {
    void addDvd(Movie movie);
    Date readValidDate(String prompt);
    void readValidMPAARating(String prompt);
    void savePersist();
    void loadPersist();
    void displayBanner();
    void displayDvd();
    void searchDvd();
    void listDvds();
    void editDvd();
    void removeDvd();
}
