package com.BatallaAerea.AirForceOne.ValueObjects;

import lombok.Data;

@Data
public class UserDTO {

    private String nombre;

    private String apellido;


    public UserDTO(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public UserDTO() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
