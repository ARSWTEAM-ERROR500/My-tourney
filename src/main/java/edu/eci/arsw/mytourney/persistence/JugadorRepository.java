package edu.arsw.mytourney.persistence;

import edu.arsw.mytourney.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador,Integer> {
}
