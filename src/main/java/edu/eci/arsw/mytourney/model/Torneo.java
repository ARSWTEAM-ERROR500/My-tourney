package edu.eci.arsw.mytourney.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Torneo {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "nombre",nullable = false,length = 255)
    private String nombre;
    @OneToMany(mappedBy = "torneo",cascade = CascadeType.ALL)
    private List<Equipo> equipos;

    @OneToMany(mappedBy = "torneo",cascade = CascadeType.ALL)
    private List<Partido> partidos;

    public Torneo() {
    }
    public Torneo(String nombre,List<Equipo> equipos, List<Partido> partidos) {
        this.equipos = equipos;
        this.nombre=nombre;
        this.partidos = partidos;
    }

    public int getId() {return id; }

    public void setId(int id) { this.id = id; }

    public List<Equipo> getEquipos() {
        return equipos;
    }

    public void setEquipos(List<Equipo> equipos) {
        this.equipos = equipos;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
