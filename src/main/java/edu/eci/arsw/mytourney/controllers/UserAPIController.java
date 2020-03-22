package edu.eci.arsw.mytourney.controllers;

import edu.eci.arsw.mytourney.model.Usuario;
import edu.eci.arsw.mytourney.services.impl.UserServicesImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/usuarios")
public class UserAPIController {

    @Autowired
    UserServicesImpl userServices;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewUser(@RequestBody Usuario usuario){
        try {
            userServices.saveUsuario(usuario);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( Exception ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
        }
    }
}
