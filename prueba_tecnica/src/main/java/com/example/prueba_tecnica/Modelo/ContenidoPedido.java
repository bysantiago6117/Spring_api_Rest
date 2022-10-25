package com.example.prueba_tecnica.Modelo;

import javax.persistence.*;

@Entity
@Table(name = "contenidopedido")
public class ContenidoPedido {

    @Id
    private long id;

    @Column
    private int cantidadRequeridad;

    @Column
    private int precio;

    @ManyToOne()
    @JoinColumn(name = "producto_id")
    private Producto producto;

    @ManyToOne()
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;

    public ContenidoPedido(long id, int cantidadRequeridad, int precio, Producto producto, Pedido pedido) {
        this.id = id;
        this.cantidadRequeridad = cantidadRequeridad;
        this.precio = precio;
        this.producto = producto;
        this.pedido = pedido;
    }
}
