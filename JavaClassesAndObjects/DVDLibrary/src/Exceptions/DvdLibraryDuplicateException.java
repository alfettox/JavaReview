package Exceptions;

public class DvdLibraryDuplicateException extends Exception{

    public DvdLibraryDuplicateException(String msg){
        super(msg);
    }

    public DvdLibraryDuplicateException(String msg, Throwable cause){
        super(msg, cause);
    }

}
