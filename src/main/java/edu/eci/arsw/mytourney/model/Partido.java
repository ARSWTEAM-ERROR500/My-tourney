package edu.eci.arsw.mytourney.model;

import javax.persistence.*;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="fk_torneo")
    private Torneo torneo;

}
