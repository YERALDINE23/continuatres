package com.ec3yasmingarcia.pe.service;

import com.ec3yasmingarcia.pe.model.Hospital;
import com.ec3yasmingarcia.pe.repository.HospitalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HospitalServiceImpl implements HospitalService {

    @Autowired
    private HospitalRepository repository;


    @Override
    public void guardar(Hospital hospital) {
        repository.save(hospital);
    }

    @Override
    public void actualizar(Hospital hospital) {
        repository.saveAndFlush(hospital);
    }

    @Override
    public void eliminar(Integer id) {
        repository.deleteById(id);
    }

    @Override
    public List<Hospital> listar() {
        return repository.findAll();
    }

    @Override
    public Hospital obtener(Integer id) {
        return repository.findById(id).orElse(null);
    }
}
