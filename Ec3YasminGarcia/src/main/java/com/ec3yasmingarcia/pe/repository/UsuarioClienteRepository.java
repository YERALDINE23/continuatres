package com.ec3yasmingarcia.pe.repository;

import com.ec3yasmingarcia.pe.model.UsuarioCliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioClienteRepository extends JpaRepository<UsuarioCliente, Integer> {
    UsuarioCliente findByUsuario(String usuario);
}
