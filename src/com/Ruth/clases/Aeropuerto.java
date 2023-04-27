package com.Ruth.clases;

import java.util.ArrayList;

public class Aeropuerto {

    private String nombre;
    private String codInternacional;
    private String direccion;
    private int capacidad;

    private Hangar<Comercial> hangarComercial = new Hangar<>();
    private Hangar<Privado> hangarPrivado = new Hangar<Privado>();
    private Hangar<Cargueros> hangarCargueros = new Hangar<Cargueros>();
    private Hangar<Militar> hangarMilitar = new Hangar<Militar>();

    ///region Constructor

    public Aeropuerto(String nombre, String codInternacional, String direccion, int capacidad) {
        this.nombre = nombre;
        this.codInternacional = codInternacional;
        this.direccion = direccion;
        this.capacidad = capacidad;
    }
    ///endregion

    ///region GYS

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodInternacional() {
        return codInternacional;
    }

    public void setCodInternacional(String codInternacional) {
        this.codInternacional = codInternacional;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Hangar<Comercial> getHangarComercial() {
        return hangarComercial;
    }

    public void setHangarComercial(Hangar<Comercial> hangarComercial) {
        this.hangarComercial = hangarComercial;
    }

    public Hangar<Privado> getHangarPrivado() {
        return hangarPrivado;
    }

    public void setHangarPrivado(Hangar<Privado> hangarPrivado) {
        this.hangarPrivado = hangarPrivado;
    }

    public Hangar<Cargueros> getHangarCargueros() {
        return hangarCargueros;
    }

    public void setHangarCargueros(Hangar<Cargueros> hangarCargueros) {
        this.hangarCargueros = hangarCargueros;
    }

    public Hangar<Militar> getHangarMilitar() {
        return hangarMilitar;
    }

    public void setHangarMilitar(Hangar<Militar> hangarMilitar) {
        this.hangarMilitar = hangarMilitar;
    }

    ///endregion

    public boolean verificarCap() {
        int ingresados = hangarCargueros.getAviones().size() + hangarComercial.getAviones().size() +
                hangarMilitar.getAviones().size() + hangarPrivado.getAviones().size();
        if (ingresados < capacidad) {
            return true;
        } else {
            return false;
        }
    }

    public void agregarAvion (Avion nuevo){
        if (verificarCap()){
            if (nuevo.getClass() == Comercial.class) {
                hangarComercial.agregar((Comercial) nuevo);
            } else if (nuevo.getClass() == Privado.class) {
                hangarPrivado.agregar((Privado) nuevo);
            } else if(nuevo.getClass() == Cargueros.class) {
                hangarCargueros.agregar((Cargueros) nuevo);
            } else if (nuevo.getClass() == Militar.class) {
                hangarMilitar.agregar((Militar) nuevo);
            } else {
                Consola.escribir("No se permite ese tipo de aviones!");
            }
        } else {
            Consola.escribir("Capacidad del aeropuerto Cubierta");
        }

    }

    @Override
    public String toString() {
        return "Aeropuerto " + nombre  + " " + codInternacional +
                "\n Capacidad = " + capacidad +
                "\n Hangar Comerciales" + hangarComercial +
                "\n Hangar Privados" + hangarPrivado +
                "\n Hangar Cargueros" + hangarCargueros +
                "\n Hangar Militares" + hangarMilitar ;
    }
}
