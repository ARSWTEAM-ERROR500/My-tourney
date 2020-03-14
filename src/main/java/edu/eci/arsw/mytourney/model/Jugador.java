package edu.eci.arsw.mytourney.model;

import com.fasterxml.jackson.annotation.JsonBackReference;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Entity
public class Jugador {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nombre",nullable = false,length = 255)
    private String nombre;
    @ManyToOne
    @JoinColumn(name="fk_equipo")
    @JsonBackReference
    private Equipo equipo;
    @OneToMany(mappedBy = "jugador",cascade = CascadeType.ALL)
    private List<Evento> estadisticas;

    public Jugador() {
    }
    public Jugador(String nombre){
        this.nombre=nombre;
        estadisticas=new LinkedList<Evento>();
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

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }
}
