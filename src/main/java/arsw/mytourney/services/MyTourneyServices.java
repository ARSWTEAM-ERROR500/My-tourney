package arsw.mytourney.services;

import arsw.mytourney.model.Equipo;
import arsw.mytourney.model.Jugador;
import arsw.mytourney.model.Partido;
import arsw.mytourney.model.Torneo;
import arsw.mytourney.persistence.MyTourneyException;
import arsw.mytourney.persistence.MyTourneyPersistence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyTourneyServices {

    @Autowired
    private MyTourneyPersistence mtp = null;

    /**
     * Consulta un torneo en la base de datos
     * @param torneoId
     * @return
     * @throws MyTourneyException
     */
    public Torneo getTorneo(Long torneoId) throws MyTourneyException {
        return mtp.consultarTorneo(torneoId);
    }

    /**
     * Consulta un equipo dentro de la base de datos
     * @param equipoId
     * @return
     * @throws MyTourneyException
     */
    public Equipo getEquipo(Long equipoId) throws MyTourneyException {
        return mtp.consultarEquipo(equipoId);
    }

    /**
     * Consulta un jugador de un equipo dentro de la base de datos
     * @param jugadorId
     * @return
     * @throws MyTourneyException
     */
    public Jugador getJugador(Long jugadorId) throws MyTourneyException {
        return mtp.consultarJugador(jugadorId);
    }

    /**
     * Consulta un partido del Torneo dentro de la base de datos
     * @param partidoId
     * @return
     * @throws MyTourneyException
     */
    public Partido getPartido(Long partidoId) throws MyTourneyException {
        return mtp.consultarPartido(partidoId);
    }

    /**
     * Crea un torneo dentro de la base de datos
     * @param torneo
     * @throws MyTourneyException
     */
    public void crearTorneo(Torneo torneo) throws MyTourneyException {
        mtp.crearTorneo(torneo);
    }

    /**
     * Registra un equipo dentro del torneo
     * @param equipo
     * @throws MyTourneyException
     */
    public void crearEquipo(Equipo equipo) throws MyTourneyException {
        mtp.registroEquipo(equipo);
    }

    /**
     * Registra a un equipo dentro del Torneo
     * @param partido
     * @throws MyTourneyException
     */
    public void crearPartido(Partido partido) throws MyTourneyException {
        mtp.registroPartido(partido);
    }

    /**
     * Registra un jugador de un equipo dentro del torneo
     * @param jugador
     * @throws MyTourneyException
     */
    public void addPlayer(Jugador jugador) throws MyTourneyException {
        mtp.registroJugador(jugador);
    }

    /**
     * Modifica los datos de un integrante de un equipo del Torneo, si aun se está dentro del plazo de tiempo
     * @param jugador
     * @throws MyTourneyException
     */
    public void modifyPlayer(Jugador jugador) throws MyTourneyException {
        mtp.modificarJugadorDeUnEquipo(jugador);
    }

    /**
     * Elimina un jugador de un equipo, si aun se está dentro del plazo de tiempo
     * @param jugadorId
     * @throws MyTourneyException
     */
    public void deletePlayer(Long jugadorId) throws MyTourneyException {
        mtp.eliminarJugadorDeUnEquipo(jugadorId);
    }
}
