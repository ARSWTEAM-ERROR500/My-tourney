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

    @Column(nullable = false)
    private String email;

    public Jugador() {
    }
    public Jugador(String nombre,String email){
        this.nombre=nombre;
        this.email=email;
        estadisticas=new LinkedList<Evento>();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Evento> getEstadisticas() {
        return estadisticas;
    }

    public void setEstadisticas(List<Evento> estadisticas) {
        this.estadisticas = estadisticas;
    }
}
