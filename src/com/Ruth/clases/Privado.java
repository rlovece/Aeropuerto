package com.Ruth.clases;

public class Privado extends Avion implements Servicios{

    private boolean jacuzzi;

    private String claveWifi;

    private int mantasEntregadas = 0;

    ///region Constructores

    public Privado(String modelo, String marca, String patente, float capcidadCombustible,
                   int cantAsientos, boolean jacuzzi, String claveWifi) {
        super(modelo, marca, patente, capcidadCombustible, cantAsientos);
        this.jacuzzi = jacuzzi;
        this.claveWifi = claveWifi;
    }

    public Privado() {}

    ///endregion

    ///region GyS

    public boolean isJacuzzi() {
        return jacuzzi;
    }

    public void setJacuzzi(boolean jacuzzi) {
        this.jacuzzi = jacuzzi;
    }

    public String getClaveWifi() {
        return claveWifi;
    }

    public void setClaveWifi(String claveWifi) {
        this.claveWifi = claveWifi;
    }

    public int getMantasEntregadas() {
        return mantasEntregadas;
    }

    public void setMantasEntregadas(int mantasEntregadas) {
        this.mantasEntregadas = mantasEntregadas;
    }

    ///endregion

    @Override
    public void darDeComer() {
        this.setEstado(EstadosAvion.VOLANDO_COMIENDO);
    }

    @Override
    public void finComer() {
        this.setEstado(EstadosAvion.VOLANDO);
    }

    @Override
    public void darMantas() {
        this.mantasEntregadas++;
    }

    @Override
    public void recuperarMantas() {
        this.mantasEntregadas--;
    }

    public void verPartido (){
        if (this.estado.compareTo(EstadosAvion.VOLANDO)==0 ||
                this.estado.compareTo(EstadosAvion.VOLANDO_COMIENDO)==0 ) {
            Consola.escribir(this.toString() + "está viendo el partido!");
        }
    }
}
