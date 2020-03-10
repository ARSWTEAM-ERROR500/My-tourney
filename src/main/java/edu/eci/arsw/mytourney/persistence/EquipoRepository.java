package edu.arsw.mytourney.persistence;

import edu.arsw.mytourney.model.Equipo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EquipoRepository extends JpaRepository<Equipo,Integer> {
}
