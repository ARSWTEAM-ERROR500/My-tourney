package edu.eci.arsw.mytourney;

import edu.eci.arsw.mytourney.model.Usuario;
import edu.eci.arsw.mytourney.persistence.UsuarioRepository;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AppTest extends TestCase {

    @Autowired
    private UsuarioRepository usuarioRepository;

    //@Autowired
    //private BCryptPasswordEncoder encoder;

    @Test
    public void crearUsuarioTest(){
        Usuario usuario = new Usuario(1,"capitan","$2a$10$Jv4wBbtFju3xPJbpVdfCCOKv1r.tpDctI8tJ7/DWHuuDRgoP227SW","Capitan");
        Usuario usuario2 = new Usuario(2,"jugador","$2a$10$Jv4wBbtFju3xPJbpVdfCCOKv1r.tpDctI8tJ7/DWHuuDRgoP227SW","Jugador");
        Usuario usuario3 = new Usuario(3,"arbitro","$2a$10$Jv4wBbtFju3xPJbpVdfCCOKv1r.tpDctI8tJ7/DWHuuDRgoP227SW","Arbitro");
        //Usuario usuarioRegistrado = usuarioRepository.save(usuario);
        //usuarioRepository.save(usuario2);
        //usuarioRepository.save(usuario3);
        //assertEquals(usuario,usuarioRegistrado);
    }
}
