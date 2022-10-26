package com.example.prueba_tecnica.Repositorio;

import com.example.prueba_tecnica.Modelo.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteReposity extends JpaRepository<Cliente, Long> {

}