package edu.eci.arsw.mytourney.exceptions;

public class EquiposException extends Exception {
    public EquiposException(String msg){
        super(msg);
    }
    public EquiposException(String msg,Throwable cause){
        super(msg,cause);
    }
}
