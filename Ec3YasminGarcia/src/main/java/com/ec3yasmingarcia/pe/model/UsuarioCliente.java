package com.ec3yasmingarcia.pe.model;

import javax.persistence.*;

@Entity
@Table(name = "usuariosclientes")
public class UsuarioCliente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idUsario;
    private String usuario;
    private String password;
    private String rol;

    @OneToOne
    Cliente cliente;

    public Integer getIdUsario() {
        return idUsario;
    }

    public void setIdUsario(Integer idUsario) {
        this.idUsario = idUsario;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}
