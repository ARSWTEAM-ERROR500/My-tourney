package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Arbitro;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArbitroRepository extends JpaRepository<Arbitro,Integer> {
    Arbitro findByEmail (String email);
}
