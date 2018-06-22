/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.JugarPartido;
import interfaces.PrepararEntrenamiento;

/**
 *
 * @author usuario
 */
public class AyudanteDeCampo extends Integrante implements JugarPartido, PrepararEntrenamiento {

    private String metodologia;

    public AyudanteDeCampo(String nombreYApellido, int edad) {
        super(nombreYApellido, edad);
        metodologia = "metodologica";
    }

    @Override
    public void jugarPartido() {
        System.out.println(getNombreYApellido()+ " - Jugando Partido");
    }

    @Override
    public void prepararEntreneamiento() {
        System.out.println(getNombreYApellido()+ " - Preparando el entrenamiento");
    }
      @Override
    public String toString (){
        return super.toString() + "\nOcupacion: Ayudante de campo" + "\nMetodologia: " + metodologia;
    }
}
