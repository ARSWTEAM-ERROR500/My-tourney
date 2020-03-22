package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface JugadorRepository extends JpaRepository<Jugador,Integer> {
    List<Jugador> findByNombreEquals(String nombre);

}
