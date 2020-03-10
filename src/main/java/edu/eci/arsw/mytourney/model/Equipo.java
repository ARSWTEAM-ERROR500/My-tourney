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


    public Equipo() {
    }
    public Equipo(String nombre,List<Jugador> jugadores){
        this.nombre=nombre;
        this.jugadores=jugadores;
    }

    public Equipo(String nombre){
        this.nombre=nombre;
        this.jugadores=new ArrayList<Jugador>();
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
}
