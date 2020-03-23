package edu.eci.arsw.mytourney.controllers;

import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.model.Partido;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.PartidoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/partidos")
public class PartidoAPIController {
    @Autowired
    PartidoServices partidoServices;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getPartidos(){
        try {
            return new ResponseEntity<>(partidoServices.getPartidos(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping( path = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getPartido(@PathVariable("id")int id){
        try {
            return new ResponseEntity<>(partidoServices.getPartido(id),HttpStatus.OK);
        }catch (Exception ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> crearPartido(@RequestBody Partido partido){
        try {
            partidoServices.crearPartido(partido);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( Exception ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
        }
    }

}
