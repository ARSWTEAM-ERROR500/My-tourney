package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.exceptions.TorneoException;
import edu.eci.arsw.mytourney.model.Torneo;

public interface TorneoServices {

    void crearTorneo(Torneo torneo)throws TorneoException;

    Torneo getTorneo()throws TorneoException;

}
