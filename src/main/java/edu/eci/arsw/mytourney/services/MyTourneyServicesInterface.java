package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.model.Partido;
import edu.eci.arsw.mytourney.model.Torneo;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;

import java.util.List;

public interface MyTourneyServicesInterface {

    public Torneo getTorneo()throws MyTourneyException;

    public Equipo getEquipo(String nombre) throws MyTourneyException;

    public List<Equipo> getEquipos()throws MyTourneyException;

    public void registrarJugador(Jugador jugador)throws MyTourneyException;

    public void crearEquipo(Equipo equipo) throws MyTourneyException ;

    public void addPlayerToTeam(Jugador jugador,String nombreEquipo) throws MyTourneyException ;

    public void removePlayerFromTeam(int jugadorid,String nombreEquipo)throws MyTourneyException;



}
