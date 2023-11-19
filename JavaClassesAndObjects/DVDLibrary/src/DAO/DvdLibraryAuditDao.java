package DAO;

import Exceptions.DvdDataPersistenceException;

public interface DvdLibraryAuditDao {
    public void writeAuditEntry(String entry) throws DvdDataPersistenceException;

}
