package edu.eci.arsw.mytourney.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Arbitro {

    @Id
    @GeneratedValue
    private int id;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String email;

    @OneToMany(mappedBy = "arbitro",cascade = CascadeType.ALL)
    private List<Partido> partidos;

    public Arbitro() {
    }
    public Arbitro(String nombre,String email) {
        this.nombre=nombre;
        this.email=email;
        this.partidos=new ArrayList<Partido>();
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Partido> getPartidos() {
        return partidos;
    }

    public void setPartidos(List<Partido> partidos) {
        this.partidos = partidos;
    }
}
