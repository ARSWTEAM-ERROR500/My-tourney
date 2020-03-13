package edu.eci.arsw.mytourney.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Usuario {
    @Id
    private int id;

    private String nombre;
    private String clave;

    public Usuario(int id, String nombre, String clave) {
        this.id = id;
        this.nombre = nombre;
        this.clave = clave;
    }

    public Usuario() {
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

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return Objects.equals(nombre, usuario.nombre) && Objects.equals(clave, usuario.clave);
    }

    @Override
    public String toString() {
        return "nombre: "+nombre+", clave:"+clave;
    }
}
