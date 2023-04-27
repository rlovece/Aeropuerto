import com.Ruth.clases.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         Aeropuerto aeropuerto = new Aeropuerto("Astor Piazola", "A213",
                "Calle falsa 123", 10);

        ArrayList<ServiciosComercial> s1 = new ArrayList<ServiciosComercial>();
        s1.add(ServiciosComercial.COMIDA);
        s1.add(ServiciosComercial.JUGO);
        s1.add(ServiciosComercial.AURICULARES);
        Comercial comercial1 = new Comercial("modeloN", "marcaM", "AK3215",
                450f, 200, 3, s1);

        ArrayList<ServiciosComercial> s2 = new ArrayList<ServiciosComercial>();
        s2.add(ServiciosComercial.COMIDA);
        s2.add(ServiciosComercial.JUGO);
        s2.add(ServiciosComercial.LUCH);
        Comercial comercial2 = new Comercial("modeloN", "marcaM", "MD2152",
                450f, 200, 4, s2);

        ArrayList<ServiciosComercial> s3 = new ArrayList<ServiciosComercial>();
        s3.add(ServiciosComercial.COMIDA);
        s3.add(ServiciosComercial.AGUA);
        s3.add(ServiciosComercial.LUCH);
        Comercial comercial3 = new Comercial("modeloK0", "marcaM2", "lk1652",
                500f, 220, 4, s3);

        aeropuerto.agregarAvion(comercial1);
        aeropuerto.agregarAvion(comercial2);
        aeropuerto.agregarAvion(comercial3);

        ArrayList<ProductosCarga> prod1 = new ArrayList<ProductosCarga>();
        prod1.add(ProductosCarga.CAJAS_FRAGILES);
        prod1.add(ProductosCarga.ALIMENTOS);
        Cargueros carguero1 = new Cargueros("m321", "airLan", "PK325", 330f,
                150000f, prod1);

        ArrayList<ProductosCarga> prod2 = new ArrayList<ProductosCarga>();
        prod2.add(ProductosCarga.QUIMICOS);
        prod2.add(ProductosCarga.CONTENEDORES);
        Cargueros carguero2 = new Cargueros("m658", "airPol", "KD655", 330f,
                320000f, prod2);

        aeropuerto.agregarAvion(carguero1);
        aeropuerto.agregarAvion(carguero2);

        Privado privado1 = new Privado("m321", "airPol", "AO315", 325f, 25, false, "WIFI123");
        Privado privado2 = new Privado("m12", "airArg", "JD213", 300f, 15, true, "Vuelo231");
        Privado privado3 = new Privado("m032", "airArg", "PL213", 300f, 23, false, "123456");

        aeropuerto.agregarAvion(privado1);
        aeropuerto.agregarAvion(privado2);
        aeropuerto.agregarAvion(privado3);

        ArrayList<Persona> autorizados1 = new ArrayList<Persona>();
        Persona p1 = new Persona("213", "Juan Perez");
        Persona p2 = new Persona("321", "Arturo Pascual");
        autorizados1.add(p1);
        autorizados1.add(p2);
        Militar militar1 = new Militar("m21", "AirPol", "PL323", 300f, 3, SistemaArmas.aire_aire,
                400,autorizados1);

        ArrayList<Persona> autorizados2 = new ArrayList<Persona>();
        Persona p3 = new Persona("223", "Pablo Perez");
        Persona p4 = new Persona("311", "Natalia Pascual");
        autorizados2.add(p1);
        autorizados2.add(p3);
        autorizados2.add(p4);
        Militar militar2 = new Militar("m59", "AirPol", "HO973", 200f, 5, SistemaArmas.aire_tierra,
                450, autorizados2);

        aeropuerto.agregarAvion(militar1);
        aeropuerto.agregarAvion(militar2);

        Consola.escribir("🛩🛩🛩 El AEROPUERTO 1er Estado 🛩🛩🛩  \n" + aeropuerto.toString());

        Consola.escribir("\n\n Intento agregar un nuevo avion pero....");

        Privado privado4 = new Privado("m692", "airArg", "PD613",
                300f, 23, false, "123456");
        aeropuerto.agregarAvion(privado4);

        Consola.escribir("\nLuego, no se agrega!");
        Consola.escribir("\n 🛩🛩🛩 El AEROPUERTO 2do Estado 🛩🛩🛩  \n" + aeropuerto.toString());


        comercial1.aterrizar();
        comercial3.darDeComer();
        carguero1.descargando();

        Consola.escribir("\n 🛩🛩🛩 El AEROPUERTO 3er Estado 🛩🛩🛩  \n" + aeropuerto.toString());

        despegarHangar("Militar", aeropuerto);

        Consola.escribir("\n 🛩🛩🛩 El AEROPUERTO 4to Estado 🛩🛩🛩  \n" + aeropuerto.toString());

    }

    static void despegarHangar (String claseAvion, Aeropuerto aeropuerto){
        if ("Comercial".equals(claseAvion)) {
            for (Comercial avion: aeropuerto.getHangarComercial().getAviones()
                 ) {
                avion.despegar();
            }
        } else if ("Privado".equals(claseAvion)) {
            for (Privado avion: aeropuerto.getHangarPrivado().getAviones()
            ) {
                avion.despegar();
            }
        } else if ("Cargueros".equals(claseAvion)) {
            for (Cargueros avion: aeropuerto.getHangarCargueros().getAviones()
            ) {
                avion.despegar();
            }
        } else if ("Militar".equals(claseAvion)) {
            for (Militar avion: aeropuerto.getHangarMilitar().getAviones()
            ) {
                avion.despegar();
            }
        } else {
            Consola.escribir("Hangar no válido!");
        }
    }
}