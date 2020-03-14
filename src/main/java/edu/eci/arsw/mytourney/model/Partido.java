package edu.eci.arsw.mytourney.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="fk_torneo")
    private Torneo torneo;

    @OneToMany(mappedBy = "partido",cascade = CascadeType.ALL)
    private List<Evento> eventos;

    @ManyToOne
    @JoinColumn(name = "fk_equipo_local")
    private Equipo equipoLocal;
    @ManyToOne
    @JoinColumn(name ="fk_equipo_visitante" )
    private Equipo equipoVisitante;



}
