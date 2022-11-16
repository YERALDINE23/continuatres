package com.ec3yasmingarcia.pe.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "hospitales")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer IdHospital;
    private String nombre;
    private String descripcion;
    private String distrito;

    @ManyToMany(mappedBy = "Listhospitales")
    private List<Cliente> clientes = new ArrayList<>();


    public Integer getIdHospital() {
        return IdHospital;
    }

    public void setIdHospital(Integer idHospital) {
        IdHospital = idHospital;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDistrito() {
        return distrito;
    }

    public void setDistrito(String distrito) {
        this.distrito = distrito;
    }
}
