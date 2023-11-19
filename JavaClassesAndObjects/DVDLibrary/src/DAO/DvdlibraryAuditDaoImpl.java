package DAO;

import Exceptions.DvdDataPersistenceException;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

public class DvdlibraryAuditDaoImpl {

    public static final String AUDIT_FILE = "audit.txt";

    public void writeAuditEntry(String entry) throws DvdDataPersistenceException {
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter(AUDIT_FILE, true));
        } catch (IOException e) {
            throw new DvdDataPersistenceException("CAN'T WRITE THE DATA.", e);
        }

        LocalDateTime timestamp = LocalDateTime.now();
        out.println(timestamp.toString() + " : " + entry);
        out.flush();
    }

}
