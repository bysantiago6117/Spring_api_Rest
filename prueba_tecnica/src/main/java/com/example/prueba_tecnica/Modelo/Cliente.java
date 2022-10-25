package com.example.prueba_tecnica.Modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    private long identificacion;

    @Column
    private String nombre;

    @Column
    private String telefono;

    @Column
    private String dirrecionCasa;

    public Cliente(long identificacion, String nombre, String telefono, String dirrecionCasa) {
        this.identificacion = identificacion;
        this.nombre = nombre;
        this.telefono = telefono;
        this.dirrecionCasa = dirrecionCasa;
    }

    public Cliente() {
    }

    public long getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(long identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDirrecionCasa() {
        return dirrecionCasa;
    }

    public void setDirrecionCasa(String dirrecionCasa) {
        this.dirrecionCasa = dirrecionCasa;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "identificacion=" + identificacion +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", dirrecionCasa='" + dirrecionCasa + '\'' +
                '}';
    }
}
