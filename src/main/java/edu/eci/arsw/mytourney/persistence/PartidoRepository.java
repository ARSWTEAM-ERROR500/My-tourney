package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PartidoRepository extends JpaRepository<Partido,Integer> {
    List<Partido> findByEquipoLocalOrEquipoVisitante(Equipo equipo,Equipo equipo2);
}
