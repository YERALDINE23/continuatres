package com.ec3yasmingarcia.pe.service;


import com.ec3yasmingarcia.pe.model.UsuarioCliente;

import java.util.List;

public interface UsuarioClienteService {
    void guardar(UsuarioCliente usuario);
    void actualizar(UsuarioCliente usuario);
    void eliminar(Integer id);
    List<UsuarioCliente> listar();
    UsuarioCliente obtener(Integer id);
}
