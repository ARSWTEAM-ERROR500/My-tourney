package edu.eci.arsw.mytourney.exceptions;

public class UserException extends  Exception{

    public UserException(String msg){
        super(msg);
    }
    public UserException(String msg,Throwable cause){
        super(msg,cause);
    }
}
