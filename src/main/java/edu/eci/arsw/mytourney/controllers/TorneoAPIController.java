package edu.eci.arsw.mytourney.controllers;

import edu.eci.arsw.mytourney.model.Torneo;
import edu.eci.arsw.mytourney.services.TorneoServices;
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
@RequestMapping(value = "/torneo")
public class TorneoAPIController {

    @Autowired
    TorneoServices torneoServices;

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> crearTorneo(@RequestBody Torneo torneo){
        try {
            torneoServices.crearTorneo(torneo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( Exception ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
        }
    }
    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getTorneo(){
        try {
            return new ResponseEntity<>(torneoServices.getTorneo(),HttpStatus.OK);
        } catch ( Exception ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }



}
