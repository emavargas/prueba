package com.pruebagit.ejemplo_git.models;

import javax.persistence.*;

@Entity
@Table(name="cuenta")
public class cuenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idCuenta;
    private String tipo;

    public cuenta(int idCuenta, String tipo) {
        this.idCuenta = idCuenta;
        this.tipo = tipo;
    }

    public int getIdCuenta() {
        return idCuenta;
    }

    public void setIdCuenta(int idCuenta) {
        this.idCuenta = idCuenta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
