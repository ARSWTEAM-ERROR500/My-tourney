package edu.eci.arsw.mytourney.security;

import edu.eci.arsw.mytourney.model.Usuario;
import edu.eci.arsw.mytourney.persistence.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyTourneyUserDetailsService implements UserDetailsService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Usuario usuario = usuarioRepository.findByNombre(username);
        if (usuario == null) {
            throw new UsernameNotFoundException("El usuario " + username + " no existe");
        }
        System.out.println(usuario);
        return new UserPrincipal(usuario);
    }
}
