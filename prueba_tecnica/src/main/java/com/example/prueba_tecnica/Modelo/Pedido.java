package com.example.prueba_tecnica.Modelo;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "pedido")
public class Pedido {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private String dirrecionEntrega;

    @Column
    private String telefonoContacto;

    @Column
    private double precioTotal;

    @ManyToOne
    private Cliente cliente;

    @OneToMany(mappedBy = "pedido")
    private List<ContenidoPedido> contenidospedidos;

    public Pedido(long id, String dirrecionEntrega, String telefonoContacto, double precioTotal, Cliente cliente, List<ContenidoPedido> contenidospedidos) {
        this.id = id;
        this.dirrecionEntrega = dirrecionEntrega;
        this.telefonoContacto = telefonoContacto;
        this.precioTotal = precioTotal;
        this.cliente = cliente;
        this.contenidospedidos = contenidospedidos;
    }

    public Pedido() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDirrecionEntrega() {
        return dirrecionEntrega;
    }

    public void setDirrecionEntrega(String dirrecionEntrega) {
        this.dirrecionEntrega = dirrecionEntrega;
    }

    public String getTelefonoContacto() {
        return telefonoContacto;
    }

    public void setTelefonoContacto(String telefonoContacto) {
        this.telefonoContacto = telefonoContacto;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ContenidoPedido> getContenidospedidos() {
        return contenidospedidos;
    }

    public void setContenidospedidos(List<ContenidoPedido> contenidospedidos) {
        this.contenidospedidos = contenidospedidos;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "id=" + id +
                ", dirrecionEntrega='" + dirrecionEntrega + '\'' +
                ", telefonoContacto='" + telefonoContacto + '\'' +
                ", precioTotal=" + precioTotal +
                ", cliente=" + cliente +
                ", contenidospedidos=" + contenidospedidos +
                '}';
    }
}
