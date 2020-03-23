package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;

import java.util.List;

public interface JugadoresServices {
    List<Jugador> getJugadores() throws MyTourneyException;

    Jugador getJugador(int id) throws MyTourneyException;



}
