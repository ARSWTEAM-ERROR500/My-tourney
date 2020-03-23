package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.exceptions.EquiposException;
import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;

import java.util.List;

public interface EquiposServices {

    Equipo getEquipo(String nombre) throws EquiposException;

    List<Equipo> getEquipos() ;

    void crearEquipo(Equipo equipo)  throws EquiposException;

    void addPlayerToTeam(Jugador jugador, String nombreEquipo)  throws EquiposException;

    void removePlayerFromTeam(Jugador jugador, String nombreEquipo)  throws EquiposException;

    void eliminarEquipo(String nombreEquipo)throws EquiposException;

}
