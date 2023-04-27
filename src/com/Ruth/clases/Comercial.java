package com.Ruth.clases;

import java.util.ArrayList;

public class Comercial extends Avion implements Servicios{

    private int cantAzafatas;

    private int mantasEntregadas = 0;

    private ArrayList<ServiciosComercial> serviciosOfrecidos =
            new ArrayList<ServiciosComercial>();

    ///region Constructores

    public Comercial(String modelo, String marca, String patente, float capcidadCombustible, int cantAsientos,
                     int cantAzafatas, ArrayList<ServiciosComercial> serviciosOfrecidos) {
        super(modelo, marca, patente, capcidadCombustible, cantAsientos);
        this.cantAzafatas = cantAzafatas;
        this.serviciosOfrecidos = serviciosOfrecidos;
    }

    public Comercial() {}

    ///endregion

    ///region GyS

    public int getCantAzafatas() {
        return cantAzafatas;
    }

    public void setCantAzafatas(int cantAzafatas) {
        this.cantAzafatas = cantAzafatas;
    }

    public ArrayList<ServiciosComercial> getServiciosOfrecidos() {
        return serviciosOfrecidos;
    }

    public void setServiciosOfrecidos(ArrayList<ServiciosComercial> serviciosOfrecidos) {
        this.serviciosOfrecidos = serviciosOfrecidos;
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



}
