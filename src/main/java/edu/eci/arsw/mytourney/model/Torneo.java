package edu.eci.arsw.mytourney.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Torneo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "nombre",nullable = false,length = 255)
    private String nombre;

    @OneToMany(mappedBy = "torneo",cascade = CascadeType.ALL)
    private List<Partido> partidos;

    @Column(nullable = false)
    private int maximoEquipos;

    @Column(nullable = false)
    private Date limiteInscripcion;

    public Torneo() {
    }
    public Torneo(String nombre,int maximoEquipos,Date limiteInscripcion){
        this.nombre=nombre;
        this.maximoEquipos=maximoEquipos;
        this.limiteInscripcion=limiteInscripcion;
        this.partidos=new ArrayList<Partido>();
    }

    public int getMaximoEquipos() {
        return maximoEquipos;
    }

    public void setMaximoEquipos(int maximoEquipos) {
        this.maximoEquipos = maximoEquipos;
    }

    public Date getLimiteInscripcion() {
        return limiteInscripcion;
    }

    public void setLimiteInscripcion(Date limiteInscripcion) {
        this.limiteInscripcion = limiteInscripcion;
    }

    public int getId() {return id; }

    public void setId(int id) { this.id = id; }

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
