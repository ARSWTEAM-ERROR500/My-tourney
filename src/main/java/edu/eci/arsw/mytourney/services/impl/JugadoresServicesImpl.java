package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.JugadorRepository;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.JugadoresServices;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class JugadoresServicesImpl implements JugadoresServices {
    @Autowired
    JugadorRepository jugadorRepository=null;

    @Override
    public List<Jugador> getJugadores() throws MyTourneyException {
        List<Jugador>jugadores=jugadorRepository.findAll();
        return jugadores;
    }

    @Override
    public Jugador getJugador(int id) throws MyTourneyException {
        Jugador jugador=jugadorRepository.findById(id).get();
        return jugador;
    }

    @Override
    public void registrarJugador(Jugador jugador) throws MyTourneyException {
        jugadorRepository.save(jugador);
    }

    @Override
    public void eliminarJugador(int id) throws MyTourneyException {
        if (jugadorRepository.existsById(id)){
            jugadorRepository.deleteById(id);
        }
    }
}
