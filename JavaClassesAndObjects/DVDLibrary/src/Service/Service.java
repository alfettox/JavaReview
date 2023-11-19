package Service;

import Exceptions.DvdDataPersistenceException;
import Exceptions.DvdDataValidationException;
import Exceptions.DvdLibraryDuplicateException;

public interface Service {
    void addDvd() throws DvdLibraryDuplicateException, DvdDataValidationException;
    void savePersist() throws DvdDataPersistenceException;
    void loadPersist() throws DvdDataPersistenceException;
    void displayDvd() throws DvdDataPersistenceException;
    void searchDvd() throws DvdDataPersistenceException;
    void listDvds() throws DvdDataPersistenceException;
    void editDvd() throws DvdDataPersistenceException;
    void removeDvd() throws DvdDataPersistenceException;
}