package edu.eci.arsw.mytourney.controllers;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.MyTourneyException;
import edu.eci.arsw.mytourney.services.MyTourneyServicesInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.logging.Level;
import java.util.logging.Logger;

@RestController
@RequestMapping(value = "/equipos")
public class MyTourneyAPIController {
    @Autowired
    private MyTourneyServicesInterface services;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<?> getAllTeams(){
        try {
            return new ResponseEntity<>(services.getEquipos(), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            Logger.getLogger(MyTourneyAPIController.class.getName()).log(Level.SEVERE, null, e);
            return new ResponseEntity<>(e.getMessage(),HttpStatus.NOT_FOUND);
        }
    }
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addNewTeam(@RequestBody Equipo newtm){
        try {
            services.crearEquipo(newtm);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( MyTourneyException ex) {
            Logger.getLogger(MyTourneyAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
        }

    }

    @RequestMapping(path = "/{nombre}",method = RequestMethod.PUT)
    public ResponseEntity<?> addPlayerToTeam(@PathVariable ("nombre") String nombre, @RequestBody Jugador jugador ){
        try {
            services.addPlayerToTeam(jugador,nombre);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch ( MyTourneyException ex) {
            Logger.getLogger(MyTourneyAPIController.class.getName()).log(Level.SEVERE, null, ex);
            return new ResponseEntity<>(ex.getMessage(),HttpStatus.FORBIDDEN);
        }
    }

}

