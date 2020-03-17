package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.model.Partido;
import edu.eci.arsw.mytourney.model.Torneo;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;

import java.util.List;

public interface MyTourneyServicesInterface {

    public Torneo getTorneo()throws MyTourneyException;

    public List<Jugador>getJugadores()throws MyTourneyException;

    public List<Jugador>getJugadorByName(String name)throws MyTourneyException;

    public void registrarJugador(Jugador jugador)throws MyTourneyException;




}
