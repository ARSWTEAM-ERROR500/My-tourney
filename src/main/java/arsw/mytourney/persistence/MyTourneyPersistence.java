package arsw.mytourney.persistence;

import arsw.mytourney.model.Equipo;
import arsw.mytourney.model.Jugador;
import arsw.mytourney.model.Partido;
import arsw.mytourney.model.Torneo;

import java.util.List;

public interface MyTourneyPersistence {

    /**
     * Registra un equipo dentro del torneo
     * @param equipo
     * @throws MyTourneyException
     */
    void registroEquipo(Equipo equipo) throws MyTourneyException;

    /**
     * Registra un jugador de un equipo dentro del torneo
     * @param jugador
     * @throws MyTourneyException
     */
    void registroJugador(Jugador jugador) throws MyTourneyException;

    /**
     * Consulta un equipo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    Equipo consultarEquipo(Long id) throws MyTourneyException;

    /**
     * Consulta un jugador de un equipo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    Jugador consultarJugador(Long id) throws MyTourneyException;

    /**
     * Modifica los datos de un integrante de un equipo del Torneo, si aun se está dentro del plazo de tiempo
     * @param nuevoJugador
     * @throws MyTourneyException
     */
    void modificarJugadorDeUnEquipo(Jugador nuevoJugador) throws MyTourneyException;

    /**
     * Elimina un jugador de un equipo, si aun se está dentro del plazo de tiempo
     * @param jugadorId
     * @throws MyTourneyException
     */
    void eliminarJugadorDeUnEquipo(Long jugadorId) throws MyTourneyException;

    /**
     * Consulta un partido del Torneo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    Partido consultarPartido(Long id) throws MyTourneyException;

    /**
     * Registra a un equipo dentro del Torneo
     * @param partido
     * @throws MyTourneyException
     */
    void registroPartido(Partido partido) throws MyTourneyException;

    /**
     * Consulta los partidos que un arbitro tiene
     * @return
     * @throws MyTourneyException
     */
    List<Partido> consultarPartidosPorArbitro () throws MyTourneyException;

    /**
     * Consulta un torneo en la base de datos
     * @param torneoId
     * @return
     * @throws MyTourneyException
     */
    Torneo consultarTorneo(Long torneoId) throws MyTourneyException;

    /**
     * Crea un torneo dentro de la base de datos
     * @param torneo
     * @throws MyTourneyException
     */
    void crearTorneo(Torneo torneo) throws MyTourneyException;
}
