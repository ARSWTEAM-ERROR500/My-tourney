package edu.eci.arsw.mytourney.controllers;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.EquiposServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/equipos")
public class EquiposAPIController {
    @Autowired
    private EquiposServices equiposServices=null;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllTeams(){
        try {
            return new ResponseEntity<>(equiposServices.getEquipos(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping( path = "/{nombre}",method = RequestMethod.GET)
    public ResponseEntity<?> getTeam(@PathVariable("nombre")String nombre){
        try {
            return new ResponseEntity<>(equiposServices.getEquipo(nombre),HttpStatus.OK);
        }catch (MyTourneyException ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewTeam(@RequestBody Equipo newtm){
        try {
            equiposServices.crearEquipo(newtm);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( MyTourneyException ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
        }
    }

    @RequestMapping( path = "/{nombre}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTeam(@PathVariable("nombre")String nombre){
        try {
            equiposServices.eliminarEquipo(nombre);
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (MyTourneyException ex){
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(path = "/{nombre}/jugadores",method = RequestMethod.POST)
    public ResponseEntity<?> addPlayerToTeam(@PathVariable ("nombre") String nombre, @RequestBody Jugador jugador ){
        try {
            equiposServices.addPlayerToTeam(jugador,nombre);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( MyTourneyException ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.CONFLICT);
        }
    }
    @RequestMapping(path = "/{nombre}/jugadores",method = RequestMethod.DELETE)
    public ResponseEntity<?> removePlayerFromTeam(@PathVariable ("nombre") String nombre, @RequestBody Jugador jugador ){
        try {
            equiposServices.removePlayerFromTeam(jugador,nombre);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch ( MyTourneyException ex) {
            Logger.getLogger(EquiposAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
}

