package edu.eci.arsw.mytourney.model;

import javax.persistence.*;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @ManyToOne
    @JoinColumn(name="fk_jugador")
    private Jugador jugador;
    @ManyToOne
    @JoinColumn(name = "fk_partido")
    private Partido partido;
    @Column(name = "minuto",nullable = false)
    private int minuto;
    @Enumerated(EnumType.STRING)
    private Tipo tipo;


}
