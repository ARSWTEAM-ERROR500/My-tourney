package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Partido;
import edu.eci.arsw.mytourney.persistence.PartidoRepository;
import edu.eci.arsw.mytourney.services.PartidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PartidoServicesImpl implements PartidoServices {
    @Autowired
    PartidoRepository partidoRepository;

    @Override
    public void crearPartido(Partido partido) {
        partidoRepository.save(partido);
    }

    @Override
    public List<Partido> getPartidos() {
        return partidoRepository.findAll();
    }

    @Override
    public Partido getPartido(int id) {
        return partidoRepository.findById(id).get();
    }

    @Override
    public List<Partido> findByEquipo(Equipo equipo) {
        return partidoRepository.findByEquipoLocalOrEquipoVisitante(equipo,equipo);
    }
}
