package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.model.Partido;
import edu.eci.arsw.mytourney.model.Torneo;
import edu.eci.arsw.mytourney.persistence.EquipoRepository;
import edu.eci.arsw.mytourney.persistence.JugadorRepository;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.persistence.PartidoRepository;
import edu.eci.arsw.mytourney.services.MyTourneyServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyTourneyServices implements MyTourneyServicesInterface {

    @Autowired
    private EquipoRepository equipoRepository = null;

    @Autowired
    private JugadorRepository jugadorRepository=null;

    @Autowired
    private PartidoRepository partidoRepository=null;


    @Override
    public Torneo getTorneo() throws MyTourneyException {
        return null;
    }

    @Override
    public List<Jugador> getJugadores() throws MyTourneyException {
        List<Jugador>jugadores=jugadorRepository.findAll();
        return jugadores;
    }

    @Override
    public List<Jugador> getJugadorByName(String name) throws MyTourneyException {
        List<Jugador>jugadores=jugadorRepository.findByNombreEquals(name);
        return jugadores;
    }


    @Override
    public void registrarJugador(Jugador jugador) throws MyTourneyException {
        jugadorRepository.save(jugador);
    }

}
