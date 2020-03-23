package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Partido;

import java.util.List;

public interface PartidoServices {
    void crearPartido(Partido partido);

    List<Partido> getPartidos();

    Partido getPartido(int id);

    List<Partido>findByEquipo(Equipo equipo);
}
