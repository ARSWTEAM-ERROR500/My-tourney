package edu.eci.arsw.mytourney.services;

import edu.eci.arsw.mytourney.exceptions.UserException;
import edu.eci.arsw.mytourney.model.Usuario;

public interface UserServices {
    Usuario findUserByEmail(String email) ;
    void saveUsuario(Usuario usuario) throws UserException;

}
