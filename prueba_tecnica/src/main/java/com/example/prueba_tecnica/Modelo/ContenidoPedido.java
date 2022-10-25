package com.example.prueba_tecnica.Modelo;

import javax.persistence.*;

public class ContenidoPedido {

    @Id
    private long id;

    @Column
    private int cantidadRequeridad;

    @Column
    private int precio;

    @OneToOne
    private Producto producto;

    @ManyToOne()
    @JoinColumn(name = "pedido_id")
    private Pedido pedido;


}
