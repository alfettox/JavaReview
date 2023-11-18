package Controller;

import DAO.DAOFileImpl;
import Service.ServiceImpl;
import View.UserIO;
import View.UserIOConsoleImpl;
import View.View;

public class Controller {
    private UserIO io = new UserIOConsoleImpl();
    private DAOFileImpl dao= new DAOFileImpl();
    private Service srv = new ServiceImpl();
    private View v = new View();

    public void run(){
        boolean ct = true;
        int menuSelection = 0;
        while (ct){
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

            menuSelection = io.readInt("Please enter your selection number", 1,9);

            switch(menuSelection){
                case 1:
                    addDvd();
                    break;
                case 2:
                    removeDvd();
                    break;
                case 3:
                    editDvd();
                    break;
                case 4:
                    listDvds();
                    break;
                case 5:
                    displayDvd();
                    break;
                case 6:
                    searchDvd();
                    break;
                case 7:
                    loadPersist();
                    break;
                case 8:
                    savePersist();
                    break;
                case 9:
                    ct = false;
                    break;
                default:
                    io.print("INVALID INPUT");
            }
        }
    v.displayExitMessage();
    }

    private void savePersist() {
        srv.savePersist();
    }

    private void loadPersist() {
        srv.loadPersist();
    }

    private void displayDvd() {
        srv.displayDvd();
    }

    private void searchDvd() {
        srv.searchDvd();
    }

    private void listDvds() {
        srv.listDvds();
    }

    private void editDvd() {
        srv.editDvd();
    }

    private void removeDvd() {
        srv.removeDvd();
    }

    private void addDvd() {
        srv.addDvd();
    }


}
