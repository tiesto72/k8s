package org.example;

import org.example.dependencias.ServicioEnvio;
import org.example.dependencias.ServicioPDF;

public class ServicioImpresion {


    //para la inyeccion de dependencias mediante constructor
    ServicioEnvio servicioEnvio;
    ServicioPDF servicioPDF;

    //constructor
    public ServicioImpresion(ServicioEnvio servicioEnvio, ServicioPDF servicioPDF) {
        this.servicioEnvio = new ServicioEnvio();
        this.servicioPDF = new ServicioPDF();
    }


    //realiza 2 dependencias
    public void imprimir(){
        servicioEnvio.envio();
        servicioPDF.PDF();

    }
}
