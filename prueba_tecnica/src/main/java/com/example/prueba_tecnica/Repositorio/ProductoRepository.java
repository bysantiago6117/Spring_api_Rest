package com.example.prueba_tecnica.Repositorio;


import com.example.prueba_tecnica.Modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
