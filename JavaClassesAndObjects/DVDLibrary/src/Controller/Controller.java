package Controller;
import View.*;
import Service.Service;

public class Controller {
    private ViewInt view;
    private Service service;

    // Constructor for dependency injection
    public Controller(ViewInt view, Service service) {
        this.view = view;
        this.service = service;
    }

    public void run(){
        boolean ct = true;
        int menuSelection = 0;
        while (ct){

            menuSelection = view.displayMenu();

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
                    view.displayInvalidInput();
            }
        }
    view.displayExitMessage();
    }

    private void savePersist() {
        service.savePersist();
    }

    private void loadPersist() {
        service.loadPersist();
    }

    private void displayDvd() {
        service.displayDvd();
    }

    private void searchDvd() {
        service.searchDvd();
    }

    private void listDvds() {
        service.listDvds();
    }

    private void editDvd() {
        service.editDvd();
    }

    private void removeDvd() {
        service.removeDvd();
    }

    private void addDvd() {
        service.addDvd();
    }


}
