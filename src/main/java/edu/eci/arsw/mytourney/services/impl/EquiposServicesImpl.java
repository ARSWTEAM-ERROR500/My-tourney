package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.exceptions.EquiposException;
import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.EquipoRepository;
import edu.eci.arsw.mytourney.persistence.JugadorRepository;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.EquiposServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EquiposServicesImpl implements EquiposServices {
    @Autowired
    private EquipoRepository equipoRepository = null;

    @Autowired
    private JugadorRepository jugadorRepository=null;


    @Override
    public Equipo getEquipo(String nombre) throws EquiposException {
        if(equipoRepository.existsById(nombre)){
            return equipoRepository.findById(nombre).get();
        }
        else {
            throw new EquiposException("El equipo no existe");
        }
    }

    @Override
    public List<Equipo> getEquipos(){
        List<Equipo> equipos=equipoRepository.findAll();
        return equipos;
    }

    @Override
    public void crearEquipo(Equipo equipo) throws EquiposException {
        equipoRepository.save(equipo);
    }

    @Override
    public void addPlayerToTeam(Jugador jugador, String nombreEquipo) throws EquiposException {
        if(equipoRepository.existsById(nombreEquipo)){
            Equipo equipo= equipoRepository.findById(nombreEquipo).get();
            equipo.agregarJugador(jugador);
            equipoRepository.save(equipo);
        }

    }

    @Override
    public void removePlayerFromTeam(Jugador jugador, String nombreEquipo) throws EquiposException {
        if(equipoRepository.existsById(nombreEquipo) ){
            Equipo equipo= equipoRepository.findById(nombreEquipo).get();
            equipo.quitarJugador(jugador);
            equipoRepository.save(equipo);
            jugadorRepository.save(jugador);
        }
    }

    @Override
    public void eliminarEquipo(String nombreEquipo) throws EquiposException {
        if(equipoRepository.existsById(nombreEquipo)){
            equipoRepository.deleteById(nombreEquipo);
        }
    }
}
