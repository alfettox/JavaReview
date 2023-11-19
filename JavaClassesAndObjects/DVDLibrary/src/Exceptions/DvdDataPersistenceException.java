package Exceptions;

public class DvdDataPersistenceException extends Exception{

    public DvdDataPersistenceException(String msg){
        super(msg);
    }

    public DvdDataPersistenceException(String msg, Throwable cause){
        super(msg, cause);
    }

}
