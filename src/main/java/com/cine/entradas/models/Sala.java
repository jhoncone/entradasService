package com.cine.entradas.models;

import javax.persistence.*;

@Entity
public class Sala {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int numero;
    //private Asiento[] asientos;


    public Sala() {
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    /*
    @OneToOne
    @JoinColumn(name = "Asiento_id", nullable = false)
    public Asiento[] getAsientos() {
        return asientos;
    }



    public void setAsientos(Asiento[] asientos) {
        this.asientos = asientos;
    }

     */
}
