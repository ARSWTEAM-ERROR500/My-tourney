package edu.eci.arsw.mytourney.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
public class Partido {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    @JoinColumn(name="fk_torneo",nullable = false)
    private Torneo torneo;

    @OneToMany(mappedBy = "partido",cascade = CascadeType.ALL)
    private List<Evento> eventos;

    @ManyToOne
    @JoinColumn(name = "fk_equipo_local",nullable = false)
    private Equipo equipoLocal;

    @ManyToOne
    @JoinColumn(name ="fk_equipo_visitante",nullable = false)
    private Equipo equipoVisitante;

    @Column(nullable = false)
    private int marcadorEquipoLocal;

    @Column(nullable = false)
    private int marcadorEquipoVisitante;

    @Enumerated(EnumType.STRING)
    private EstadoPartido estadoPartido;

    @Column(nullable = false)
    private Date fechaInicio;

    public Partido() {
    }

    public Partido(Equipo equipoLocal, Equipo equipoVisitante, Date fecha) {
        this.equipoLocal=equipoLocal;
        this.equipoVisitante=equipoVisitante;
        this.fechaInicio=fecha;
        this.marcadorEquipoLocal=0;
        this.marcadorEquipoVisitante=0;
        this.estadoPartido=EstadoPartido.POR_JUGAR;
        this.eventos=new ArrayList<Evento>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Torneo getTorneo() {
        return torneo;
    }

    public void setTorneo(Torneo torneo) {
        this.torneo = torneo;
    }

    public List<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(List<Evento> eventos) {
        this.eventos = eventos;
    }

    public Equipo getEquipoLocal() {
        return equipoLocal;
    }

    public void setEquipoLocal(Equipo equipoLocal) {
        this.equipoLocal = equipoLocal;
    }

    public Equipo getEquipoVisitante() {
        return equipoVisitante;
    }

    public void setEquipoVisitante(Equipo equipoVisitante) {
        this.equipoVisitante = equipoVisitante;
    }

    public int getMarcadorEquipoLocal() {
        return marcadorEquipoLocal;
    }

    public void setMarcadorEquipoLocal(int marcadorEquipoLocal) {
        this.marcadorEquipoLocal = marcadorEquipoLocal;
    }

    public int getMarcadorEquipoVisitante() {
        return marcadorEquipoVisitante;
    }

    public void setMarcadorEquipoVisitante(int marcadorEquipoVisitante) {
        this.marcadorEquipoVisitante = marcadorEquipoVisitante;
    }

    public EstadoPartido getEstadoPartido() {
        return estadoPartido;
    }

    public void setEstadoPartido(EstadoPartido estadoPartido) {
        this.estadoPartido = estadoPartido;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
}
