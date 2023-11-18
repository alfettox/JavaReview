package View;

import DTO.Movie;

public class View {
    UserIO io = new UserIOConsoleImpl();

    public void displayInfo(Movie m) {
        if (m != null) {
            displayBanner("DVD INFO");
            io.print("TITLE:        " + m.getTitle());
            io.print("RELEASE DATE: " + m.getTitle());
            io.print("MPAA RATING:  " + m.getTitle());
            io.print("DIRECTOR:     " + m.getTitle());
            io.print("STUDIO:       " + m.getTitle());
            io.print("USER RATING:  " + m.getTitle());
        } else {
            displayNotFound(m.getTitle());
        }
    }

    public void displayBanner(String addDvd) {
        io.print("===================");
        io.print("===" + addDvd + "===");
    }

    public void displayNotFound(String title) {
        io.print("The movie: " + title + " has not been found.");
    }


    public void displayExitMessage() {
        io.print("THANKS. GOODBYE");
    }
}
