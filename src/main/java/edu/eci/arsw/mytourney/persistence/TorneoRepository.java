package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Torneo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TorneoRepository extends JpaRepository<Torneo,Integer> {
}
