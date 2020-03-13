package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<Usuario,Integer> {
    Usuario findByNombre(String nombre);
}
