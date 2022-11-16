package com.ec3yasmingarcia.pe.service;


import com.ec3yasmingarcia.pe.model.UsuarioCliente;
import com.ec3yasmingarcia.pe.repository.UsuarioClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioClienteServiceImpl implements UsuarioClienteService {

    @Autowired
    private UsuarioClienteRepository repository;


    @Override
    public void guardar(UsuarioCliente usuario) {
        repository.save(usuario);
    }

    @Override
    public void actualizar(UsuarioCliente usuario) {
        repository.saveAndFlush(usuario);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<UsuarioCliente> listar() {
        return repository.findAll();
    }

    @Override
    public UsuarioCliente obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
