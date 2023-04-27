package com.Ruth.clases;

public class Persona {

    private String dni;

    private String nombre;

    ///region Constructor

    public Persona(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    ///endregion

    ///region GYS

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    ///endregion


    @Override
    public String toString() {
        return "Nombre: " + nombre +
                "DNI : " + dni;
    }

}
