package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Partido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PartidoRepository extends JpaRepository<Partido,Integer> {
}
