package edu.eci.arsw.mytourney.services.impl;

import edu.eci.arsw.mytourney.model.Usuario;
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
    private BCryptPasswordEncoder bCryptPasswordEncoder;


    @Override
    public Usuario findUserByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public void saveUsuario(Usuario usuario) {
        usuario.setPassword(bCryptPasswordEncoder.encode(usuario.getPassword()));
        usuario.setRole(usuario.getRole());
        userRepository.save(usuario);
    }
}
