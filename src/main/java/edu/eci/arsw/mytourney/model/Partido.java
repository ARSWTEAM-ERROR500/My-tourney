package edu.eci.arsw.mytourney.model;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="fk_torneo",nullable = false)
    private Torneo torneo;

    @OneToMany(mappedBy = "partido",cascade = CascadeType.ALL)
    private List<Evento> eventos;

    @ManyToOne
    @JoinColumn(name = "fk_equipo_local",nullable = false)
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name ="fk_equipo_visitante",nullable = false)
    private Equipo equipoVisitante;

    @Column(nullable = false)
    private int marcadorEquipoLocal;

    @Column(nullable = false)
    private int marcadorEquipoVisitante;

    @Enumerated(EnumType.STRING)
    private EstadoPartido estadoPartido;


    private Date fecha;

    public Partido(Equipo equipoLocal,Equipo equipoVisitante,Date fecha) {
    }
}
