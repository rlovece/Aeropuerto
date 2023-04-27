package com.Ruth.clases;

public abstract class Avion {

    protected String modelo;
    protected String marca;

    protected String patente;
    protected float capcidadCombustible;

    protected int cantAsientos;
    protected EstadosAvion estado = EstadosAvion.ESTACIONADO;

    ///region Constructores
    public Avion(String modelo, String marca, String patente, float capcidadCombustible, int cantAsientos) {
        this.modelo = modelo;
        this.marca = marca;
        this.patente = patente;
        this.capcidadCombustible = capcidadCombustible;
        this.cantAsientos = cantAsientos;
    }

    public Avion (){};

    ///endregion

    ///region G y S
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String motor) {
        this.patente = motor;
    }

    public float getCapcidadCombustible() {
        return capcidadCombustible;
    }

    public void setCapcidadCombustible(float capcidadCombustible) {
        this.capcidadCombustible = capcidadCombustible;
    }

    public int getCantAsientos() {
        return cantAsientos;
    }

    public void setCantAsientos(int cantAsientos) {
        this.cantAsientos = cantAsientos;
    }

    public EstadosAvion getEstado() {
        return estado;
    }

    public void setEstado(EstadosAvion estado) {
        this.estado = estado;
    }

    ///endregion

    public void despegar(){
        this.setEstado(EstadosAvion.DESPEGANDO);
    }
    public void aterrizar(){
        this.setEstado(EstadosAvion.ATERRIZANDO);
    }
    public void volar(){
        this.setEstado(EstadosAvion.VOLANDO);
    }

    public void estacionar(){
        this.setEstado(EstadosAvion.ESTACIONADO);
    }

    @Override
    public String toString() {
        return "Patente: " + patente +
                " Estado: " + estado ;
    }
}
