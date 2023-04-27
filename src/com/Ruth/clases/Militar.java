package com.Ruth.clases;

import java.util.ArrayList;

public class Militar extends Avion implements Seguridad {

    private SistemaArmas sistemasDeArmas;

    private int cantBalas;

    private ArrayList<Persona> autorizados = new ArrayList<Persona>();

    ///region Constructor

    public Militar(String modelo, String marca, String patente, float capcidadCombustible,
                   int cantAsientos, SistemaArmas sistemasDeArmas, int cantBalas, ArrayList<Persona> autorizados) {
        super(modelo, marca, patente, capcidadCombustible, cantAsientos);
        this.sistemasDeArmas = sistemasDeArmas;
        this.cantBalas = cantBalas;
        this.autorizados = autorizados;
    }

    public Militar (){}
    ///endregion

    ///region GYS

    public SistemaArmas getSistemasDeArmas() {
        return sistemasDeArmas;
    }

    public void setSistemasDeArmas(SistemaArmas sistemasDeArmas) {
        this.sistemasDeArmas = sistemasDeArmas;
    }

    public int getCantBalas() {
        return cantBalas;
    }

    public void setCantBalas(int cantBalas) {
        this.cantBalas = cantBalas;
    }

    public ArrayList<Persona> getAutorizados() {
        return autorizados;
    }

    public void setAutorizados(ArrayList<Persona> autorizados) {
        this.autorizados = autorizados;
    }

    ///endregion


    @Override
    public boolean ingresar (String dni) {

        for (Persona buscado: autorizados
        ) {
            if (dni == buscado.getDni()){
                return true;
            }
        }
        return false;
    }
}
