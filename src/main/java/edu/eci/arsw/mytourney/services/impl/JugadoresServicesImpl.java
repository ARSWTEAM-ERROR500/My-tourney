package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.JugadorRepository;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.JugadoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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

}
