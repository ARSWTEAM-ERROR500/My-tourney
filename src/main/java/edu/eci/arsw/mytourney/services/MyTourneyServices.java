package edu.arsw.mytourney.services;

import edu.arsw.mytourney.model.Equipo;
import edu.arsw.mytourney.model.Jugador;
import edu.arsw.mytourney.model.Partido;
import edu.arsw.mytourney.model.Torneo;
import edu.arsw.mytourney.persistence.MyTourneyException;

public class MyTourneyServices {

    //@Autowired
   // private MyTourneyPersistence mtp = null;

    /**
     * Consulta un torneo en la base de datos
     * @param torneoId
     * @return
     * @throws MyTourneyException
     */
    public Torneo getTorneo(Long torneoId) throws MyTourneyException {
        return null;
    }

    /**
     * Consulta un equipo dentro de la base de datos
     * @param equipoId
     * @return
     * @throws MyTourneyException
     */
    public Equipo getEquipo(Long equipoId) throws MyTourneyException {
        return null;
    }

    /**
     * Consulta un jugador de un equipo dentro de la base de datos
     * @param jugadorId
     * @return
     * @throws MyTourneyException
     */
    public Jugador getJugador(Long jugadorId) throws MyTourneyException {
        return null;
    }

    /**
     * Consulta un partido del Torneo dentro de la base de datos
     * @param partidoId
     * @return
     * @throws MyTourneyException
     */
    public Partido getPartido(Long partidoId) throws MyTourneyException {
        return null;
    }

    /**
     * Crea un torneo dentro de la base de datos
     * @param torneo
     * @throws MyTourneyException
     */
    public void crearTorneo(Torneo torneo) throws MyTourneyException {
       ;
    }

    /**
     * Registra un equipo dentro del torneo
     * @param equipo
     * @throws MyTourneyException
     */
    public void crearEquipo(Equipo equipo) throws MyTourneyException {
        ;
    }

    /**
     * Registra a un equipo dentro del Torneo
     * @param partido
     * @throws MyTourneyException
     */
    public void crearPartido(Partido partido) throws MyTourneyException {
       ;
    }

    /**
     * Registra un jugador de un equipo dentro del torneo
     * @param jugador
     * @throws MyTourneyException
     */
    public void addPlayer(Jugador jugador) throws MyTourneyException {
        ;
    }

    /**
     * Modifica los datos de un integrante de un equipo del Torneo, si aun se está dentro del plazo de tiempo
     * @param jugador
     * @throws MyTourneyException
     */
    public void modifyPlayer(Jugador jugador) throws MyTourneyException {
       ;
    }

    /**
     * Elimina un jugador de un equipo, si aun se está dentro del plazo de tiempo
     * @param jugadorId
     * @throws MyTourneyException
     */
    public void deletePlayer(Long jugadorId) throws MyTourneyException {
       ;
    }
}
