package edu.arsw.mytourney.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Equipo {

    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private  int id;
    @Column(name = "nombre",nullable = false,length = 255)
    private String nombre;
    @OneToMany(mappedBy = "equipo",cascade = CascadeType.ALL)
    private List<Jugador> jugadores;


    public Equipo() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
