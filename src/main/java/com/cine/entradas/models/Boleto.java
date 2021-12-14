package com.cine.entradas.models;


import javax.persistence.*;

@Entity
public class Boleto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "User_id", nullable = false)
    private User user;

    @OneToOne
    @JoinColumn(name = "Sala_id", nullable = false)

    private Sala sala;

    public Boleto() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }
}
