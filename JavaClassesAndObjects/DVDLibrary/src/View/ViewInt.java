package View;

import DTO.Movie;

import java.util.Date;

public interface ViewInt {
    void addDvd(Movie movie);
    void savePersist();
    void loadPersist();
    void displayDvd();
    void searchDvd();
    void listDvds();
    void editDvd();
    void removeDvd();
    int displayMenu();
    void displayBanner(String str);
    void displayError(String str);
    void displayInfo(Movie movie);
    void displayNotFound(String title);
    void displayExitMessage();
    void displayInvalidInput();

    UserIO getUserIO();
}
