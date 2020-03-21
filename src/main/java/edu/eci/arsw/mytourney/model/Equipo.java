package edu.eci.arsw.mytourney.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Equipo {
    @Id
    private String nombre;



    @OneToMany(mappedBy = "equipo",cascade = CascadeType.ALL)
    @JsonManagedReference
    private List<Jugador> jugadores;
    @ManyToOne
    @JoinColumn(name="fk_torneo")
    private Torneo torneo;
    @OneToOne
    private Jugador capitan;

    public Equipo() {
    }

    public Equipo(String nombre,Jugador capitan){
        this.nombre=nombre;
        this.jugadores=new ArrayList<Jugador>();
        jugadores.add(capitan);
        this.capitan=capitan;
    }

    public Jugador getCapitan() {
        return capitan;
    }

    public void setCapitan(Jugador capitan) {
        this.capitan = capitan;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(List<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public void agregarJugador(Jugador jugador){
        jugador.setEquipo(this);
        jugadores.add(jugador);
    }

    public void quitarJugador(Jugador jugador) {
        jugador.setEquipo(null);
        jugadores.remove(jugador);
    }
}
