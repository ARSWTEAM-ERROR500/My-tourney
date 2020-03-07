package arsw.mytourney.persistence;

public class MyTourneyException extends Exception{

    public MyTourneyException(String msg){
        super(msg);
    }
    public MyTourneyException(String msg,Throwable cause){
        super(msg,cause);
    }
}
