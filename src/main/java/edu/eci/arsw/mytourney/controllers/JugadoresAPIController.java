package edu.eci.arsw.mytourney.controllers;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.JugadoresServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/jugadores")
public class JugadoresAPIController {
    @Autowired
    JugadoresServices jugadoresServices=null;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getJugadores(){
        try {
            return new ResponseEntity<>(jugadoresServices.getJugadores(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping( path = "/{id}",method = RequestMethod.GET)
    public ResponseEntity<?> getJugador(@PathVariable("id")int id){
        try {
            return new ResponseEntity<>(jugadoresServices.getJugador(id),HttpStatus.OK);
        }catch (MyTourneyException ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewPlayer(@RequestBody Jugador newpl){
        try {
            jugadoresServices.registrarJugador(newpl);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( MyTourneyException ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
        }
    }
    @RequestMapping( path = "/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTeam(@PathVariable("id")int id){
        try {
            jugadoresServices.eliminarJugador(id);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (MyTourneyException ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

}
