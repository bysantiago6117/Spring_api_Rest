package com.example.prueba_tecnica.Modelo;




import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "productos")
public class Producto {

    @Id
    private long codigo;

    @Column(length = 20)
    private String nombre;

    @Column
    private int precioXunidad;

    @OneToMany(mappedBy = "producto")
    private List<ContenidoPedido> contenidospedidoslist;

    public Producto(long codigo, String nombre, int precioXunidad, List<ContenidoPedido> contenidospedidoslist) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precioXunidad = precioXunidad;
        this.contenidospedidoslist = contenidospedidoslist;
    }

    public Producto() {
    }

    public long getCodigo() {
        return codigo;
    }

    public void setCodigo(long codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecioXunidad() {
        return precioXunidad;
    }

    public void setPrecioXunidad(int precioXunidad) {
        this.precioXunidad = precioXunidad;
    }

    public List<ContenidoPedido> getContenidospedidoslist() {
        return contenidospedidoslist;
    }

    public void setContenidospedidoslist(List<ContenidoPedido> contenidospedidoslist) {
        this.contenidospedidoslist = contenidospedidoslist;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigo=" + codigo +
                ", nombre='" + nombre + '\'' +
                ", precioXunidad=" + precioXunidad +
                ", contenidospedidoslist=" + contenidospedidoslist +
                '}';
    }
}
