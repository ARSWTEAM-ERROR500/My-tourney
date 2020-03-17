package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;

import java.util.List;

public interface EquiposServices {

    Equipo getEquipo(String nombre) throws MyTourneyException;

    List<Equipo> getEquipos() throws MyTourneyException;

    void crearEquipo(Equipo equipo) throws MyTourneyException;

    void addPlayerToTeam(Jugador jugador, String nombreEquipo) throws MyTourneyException;

    void removePlayerFromTeam(Jugador jugador, String nombreEquipo) throws MyTourneyException;

    void eliminarEquipo(String nombreEquipo)throws MyTourneyException;

}
