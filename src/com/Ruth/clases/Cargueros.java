package com.Ruth.clases;

import java.util.ArrayList;

public class Cargueros extends Avion implements Seguridad{

    private float kgCarga;
    private ArrayList<ProductosCarga>  productosDeCarga = new ArrayList<ProductosCarga>();

    private ArrayList<Persona>  autorizados = new ArrayList<Persona>();

    ///region Constructor

    public Cargueros(String modelo, String marca, String patente, float capcidadCombustible,
                     float kgCarga, ArrayList<ProductosCarga> productosDeCarga) {
        super(modelo, marca, patente, capcidadCombustible, 0);
        this.kgCarga = kgCarga;
        this.productosDeCarga = productosDeCarga;
    }

    public Cargueros() {}

    ///endregion

    ///region GyS

    public float getKgCarga() {
        return kgCarga;
    }

    public void setKgCarga(float kgCarga) {
        this.kgCarga = kgCarga;
    }

    public ArrayList<ProductosCarga> getProductosDeCarga() {
        return productosDeCarga;
    }

    public void setProductosDeCarga(ArrayList<ProductosCarga> productosDeCarga) {
        this.productosDeCarga = productosDeCarga;
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

    public void descargando (){
        estado = EstadosAvion.ESTACIONADO_DESCANGANDO;
    }

}
