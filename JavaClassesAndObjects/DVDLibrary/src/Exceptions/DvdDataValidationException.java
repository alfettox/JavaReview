package Exceptions;

public class DvdDataValidationException extends Exception{

    public DvdDataValidationException(String msg){
        super(msg);
    }

    public DvdDataValidationException(String msg, Throwable cause){
        super(msg, cause);
    }

}
