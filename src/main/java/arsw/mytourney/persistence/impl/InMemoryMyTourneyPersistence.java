package arsw.mytourney.persistence.impl;

import arsw.mytourney.model.Equipo;
import arsw.mytourney.model.Jugador;
import arsw.mytourney.model.Partido;
import arsw.mytourney.persistence.MyTourneyException;
import arsw.mytourney.persistence.MyTourneyPersistence;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InMemoryMyTourneyPersistence implements MyTourneyPersistence {

    /**
     * Registra un equipo dentro del torneo
     * @param equipo
     * @throws MyTourneyException
     */
    @Override
    public void registroEquipo(Equipo equipo) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Registra un jugador de un equipo dentro del torneo
     * @param jugador
     * @throws MyTourneyException
     */
    @Override
    public void registroJugador(Jugador jugador) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Consulta un equipo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    @Override
    public Equipo consultarEquipo(int id) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Consulta un jugador de un equipo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    @Override
    public Jugador consultarJugador(int id) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Modifica los datos de un integrante de un equipo del Torneo, si aun se está dentro del plazo de tiempo
     * @param nuevoJugador
     * @throws MyTourneyException
     */
    @Override
    public void modificarJugadorDeUnEquipo(Jugador nuevoJugador) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Elimina un jugador de un equipo, si aun se está dentro del plazo de tiempo
     * @param jugador
     * @throws MyTourneyException
     */
    @Override
    public void eliminarJugadorDeUnEquipo(Jugador jugador) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Consulta un partido del Torneo dentro de la base de datos
     * @param id
     * @return
     * @throws MyTourneyException
     */
    @Override
    public Partido consultarPartido(int id) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Registra a un equipo dentro del Torneo
     * @param partido
     * @throws MyTourneyException
     */
    @Override
    public void registroPartido(Partido partido) throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }

    /**
     * Consulta los partidos que un arbitro tiene
     * @return
     * @throws MyTourneyException
     */
    @Override
    public List<Partido> consultarPartidosPorArbitro() throws MyTourneyException {
        throw new MyTourneyException("En construccion");
    }
}
