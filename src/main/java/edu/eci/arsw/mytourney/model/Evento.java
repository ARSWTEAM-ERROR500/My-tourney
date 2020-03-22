package edu.eci.arsw.mytourney.model;

import javax.persistence.*;

@Entity
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name = "fk_jugador", nullable = false)
    private Jugador jugador;

    @ManyToOne
    @JoinColumn(name = "fk_partido", nullable = false)
    private Partido partido;

    @Column(name = "minuto", nullable = false)
    private int minuto;

    @Enumerated(EnumType.STRING)
    private Tipo tipo;

    public Evento() {
    }

    public Evento(Jugador jugador, Partido partido, int minuto, Tipo tipo) {
        this.jugador = jugador;
        this.partido=partido;
        this.minuto=minuto;
        this.tipo=tipo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public Partido getPartido() {
        return partido;
    }

    public void setPartido(Partido partido) {
        this.partido = partido;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }
}
