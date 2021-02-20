package com.BatallaAerea.AirForceOne.persistence.entities;

import javax.persistence.*;

@Entity
@Table(name = "gonza_se_la_come", catalog = "gonza_puto")
public class User {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nombre_pute")
    private String nombrePute;

    @Column(name = "apellido_pute")
    private String apellidoPute;


    public User(Long id,
                String nombrePute,
                String apellidoPute) {
        this.id = id;
        this.nombrePute = nombrePute;
        this.apellidoPute = apellidoPute;
    }

    public User() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombrePute() {
        return nombrePute;
    }

    public void setNombrePute(String nombrePute) {
        this.nombrePute = nombrePute;
    }

    public String getApellidoPute() {
        return apellidoPute;
    }

    public void setApellidoPute(String apellidoPute) {
        this.apellidoPute = apellidoPute;
    }
}
