package edu.eci.arsw.mytourney.exceptions;

public class TorneoException extends Exception {

    public TorneoException(String msg){
        super(msg);
    }
    public TorneoException(String msg,Throwable cause){
        super(msg,cause);
    }
}
