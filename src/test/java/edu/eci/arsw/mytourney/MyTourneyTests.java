package edu.eci.arsw.mytourney;

import edu.eci.arsw.mytourney.model.Equipo;
import edu.eci.arsw.mytourney.model.Jugador;
import edu.eci.arsw.mytourney.persistence.EquipoRepository;
import edu.eci.arsw.mytourney.persistence.JugadorRepository;
import edu.eci.arsw.mytourney.persistence.PartidoRepository;
import edu.eci.arsw.mytourney.persistence.TorneoRepository;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Unit test for simple App.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class MyTourneyTests extends TestCase {
    @Autowired
    private JugadorRepository jugadorRepository;
    @Autowired
    private EquipoRepository equipoRepository;
    @Autowired
    private PartidoRepository partidoRepository;
    @Autowired
    private TorneoRepository torneoRepository;

    @Test
    public void deberiaMostrarUnJugador() {
        List<Jugador> jugadorList = jugadorRepository.findByNombreEquals("a");
        if (jugadorList.isEmpty()) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }

    @Test
    public void deberiaListarTodosJugadores() {

        List<Jugador> jugadorList = jugadorRepository.findAll();
        if (jugadorList.isEmpty()) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }

    @Test
    public void deberiaInsertarUnJugador() {

        List<Jugador> jugadorList = jugadorRepository.findAll();
        if (jugadorList.isEmpty()) {
            assertTrue(false);
        } else {
            assertTrue(true);
        }
    }

//    @Test
//    public void deberiaListarEquipos() {
//        List<Equipo> equipoList
//    }
}
