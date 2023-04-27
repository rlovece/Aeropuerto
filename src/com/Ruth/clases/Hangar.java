package com.Ruth.clases;

import java.util.ArrayList;

public class Hangar <T> {

    private ArrayList<T> aviones = new ArrayList<T>();

    ///region Constructor
    public Hangar (){}
    ///endregion

    ///region GYS

    public ArrayList<T> getAviones() {
        return aviones;
    }

    public void setAviones(ArrayList<T> aviones) {
        this.aviones = aviones;
    }

    ///endregion
    public void agregar (T nuevo){
        aviones.add(nuevo);
    }


    @Override
    public String toString() {
        return " " + aviones;
    }




}
