package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.exceptions.UserException;
import edu.eci.arsw.mytourney.model.Arbitro;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.model.Role;
import edu.eci.arsw.mytourney.model.Usuario;
import edu.eci.arsw.mytourney.persistence.ArbitroRepository;
import edu.eci.arsw.mytourney.persistence.JugadorRepository;
import edu.eci.arsw.mytourney.persistence.UserRepository;
import edu.eci.arsw.mytourney.services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {

    @Autowired
    UserRepository userRepository;

    @Autowired
    JugadorRepository jugadorRepository;

    @Autowired
    ArbitroRepository arbitroRepository;

    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public Usuario findUserByEmail(String email){
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUsuario(Usuario usuario) throws UserException {
        if (findUserByEmail(usuario.getEmail()) == null) {
            usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
            userRepository.save(usuario);
            if (usuario.getRole().equals(Role.PLAYER)) {
                jugadorRepository.save(new Jugador(usuario.getName(), usuario.getEmail()));
            } else if (usuario.getRole().equals(Role.REFEREE)) {
                arbitroRepository.save(new Arbitro(usuario.getName(), usuario.getEmail()));
            }
        } else {
            throw new UserException("El usuario ya existe");
        }
    }
}
