package com.ec3yasmingarcia.pe.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "clientes")
public class Cliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCliente;
    private String nombre;
    private Integer celular;

    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "ciente_hospital",
            joinColumns = @JoinColumn(
                    name = "id_cliente",
                    nullable = false,
                    unique = true,
                    foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key (id_cliente) references clientes(id_cliente)")
            ),
            inverseJoinColumns = @JoinColumn(
                    name = "id_hospital",
                    nullable = false,
                    unique = true,
                    foreignKey =  @ForeignKey(foreignKeyDefinition = "foreign key (id_hospital) references hospitales(id_hospital)")
            )
    )
    private List<Hospital> Listhospitales = new ArrayList<>();


    @OneToOne
    UsuarioCliente usuarioCliente;

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getCelular() {
        return celular;
    }

    public void setCelular(Integer celular) {
        this.celular = celular;
    }
}
