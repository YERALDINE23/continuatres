package com.ec3yasmingarcia.pe.service;


import com.ec3yasmingarcia.pe.model.Hospital;

import java.util.List;

public interface HospitalService {

    void guardar(Hospital hospital);
    void actualizar(Hospital hospital);
    void eliminar(Integer id);
    List<Hospital> listar();
    Hospital obtener(Integer id);
}
