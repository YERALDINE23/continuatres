package com.ec3yasmingarcia.pe.service;



import com.ec3yasmingarcia.pe.model.Cliente;

import java.util.List;

public interface ClienteService {
    void guardar(Cliente cliente);
    void actualizar(Cliente cliente);
    void eliminar(Integer id);
    List<Cliente> listar();
    Cliente obtener(Integer id);
}
