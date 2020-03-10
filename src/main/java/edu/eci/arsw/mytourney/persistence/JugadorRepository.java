package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JugadorRepository extends JpaRepository<Jugador,Integer> {
}
