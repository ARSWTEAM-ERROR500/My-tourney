package arsw.mytourney.persistence;

import arsw.mytourney.model.Equipo;
import arsw.mytourney.model.Jugador;
import arsw.mytourney.model.Partido;
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
    Equipo consultarEquipo(int id) throws MyTourneyException;

    /**
     * Consulta un jugador de un equipo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    Jugador consultarJugador(int id) throws MyTourneyException;

    /**
     * Modifica los datos de un integrante de un equipo del Torneo, si aun se está dentro del plazo de tiempo
     * @param nuevoJugador
     * @throws MyTourneyException
     */
    void modificarJugadorDeUnEquipo(Jugador nuevoJugador) throws MyTourneyException;

    /**
     * Elimina un jugador de un equipo, si aun se está dentro del plazo de tiempo
     * @param jugador
     * @throws MyTourneyException
     */
    void eliminarJugadorDeUnEquipo(Jugador jugador) throws MyTourneyException;

    /**
     * Consulta un partido del Torneo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    Partido consultarPartido(int id) throws MyTourneyException;

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
}
