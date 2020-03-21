package edu.eci.arsw.mytourney.persistence;

import edu.eci.arsw.mytourney.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Usuario, Long> {
    Usuario findByEmail(String email);
}
