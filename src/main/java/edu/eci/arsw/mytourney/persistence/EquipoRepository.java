package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo,String> {
}
