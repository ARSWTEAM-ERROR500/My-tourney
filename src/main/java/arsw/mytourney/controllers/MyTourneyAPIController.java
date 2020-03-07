package arsw.mytourney.controllers;

import arsw.mytourney.model.Equipo;
import arsw.mytourney.model.Jugador;
import arsw.mytourney.model.Partido;
import arsw.mytourney.model.Torneo;
import arsw.mytourney.persistence.MyTourneyException;
import arsw.mytourney.services.MyTourneyServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/app")
public class MyTourneyAPIController {

    @Autowired
    MyTourneyServices mts = null;

    @RequestMapping(value = "/{torneoId}", method = RequestMethod.GET)
    public ResponseEntity<?> getResource(@PathVariable("torneoId") Long torneoId, @RequestParam(value = "equipo", defaultValue = "0") Long equipoId, @RequestParam(value = "jugador", defaultValue = "0") Long jugadorId, @RequestParam(value = "partido", defaultValue = "0") Long partidoId) {
        try {
            ResponseEntity<?> responseEntity;
            if (equipoId == 0 && jugadorId == 0 && partidoId == 0) {
                responseEntity = new ResponseEntity<>(mts.getTorneo(torneoId), HttpStatus.ACCEPTED);
            } else if (jugadorId == 0 && partidoId == 0) {
                responseEntity = new ResponseEntity<>(mts.getEquipo(equipoId), HttpStatus.ACCEPTED);
            } else if (partidoId == 0) {
                responseEntity = new ResponseEntity<>(mts.getJugador(jugadorId), HttpStatus.ACCEPTED);
            } else {
                responseEntity = new ResponseEntity<>(mts.getPartido(partidoId), HttpStatus.ACCEPTED);
            }
            return responseEntity;
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> createTourney(@RequestBody Torneo torneo) {
        try {
            mts.crearTorneo(torneo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/equipos", method = RequestMethod.POST)
    public ResponseEntity<?> createTeam(@RequestBody Equipo equipo) {
        try {
            mts.crearEquipo(equipo);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/partidos", method = RequestMethod.POST)
    public ResponseEntity<?> createMatch(@RequestBody Partido partido) {
        try {
            mts.crearPartido(partido);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/jugadores", method = RequestMethod.POST)
    public ResponseEntity<?> addPlayer(@RequestBody Jugador jugador) {
        try {
            mts.addPlayer(jugador);
            return new ResponseEntity<>(HttpStatus.CREATED);
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @RequestMapping(value = "/jugadores", method = RequestMethod.PUT)
    public ResponseEntity<?> modifyPlayer(@RequestBody Jugador jugador) {
        try {
            mts.modifyPlayer(jugador);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.CONFLICT);
        }
    }

    @RequestMapping(value = "/jugadores/{jugadorId}", method = RequestMethod.DELETE)
    public ResponseEntity<?> deletePlayer(@PathVariable("jugadorId") Long jugadorId) {
        try {
            mts.deletePlayer(jugadorId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (MyTourneyException e) {
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    //Falta consultar partidos por arbitro
}
