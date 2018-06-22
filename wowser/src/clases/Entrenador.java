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
public class Entrenador extends Integrante implements PrepararEntrenamiento,JugarPartido{
    
    private String sistemaDeJuego;
    private String estilo;
    
    /// hacer constructores de todos los integrantes y asignar algo a sistema de juego y estilo 
    
    public Entrenador(String nombreYApellido, int edad){
        super(nombreYApellido, edad);
        sistemaDeJuego = "Cualquiera que sirva";
        estilo = "todos abajo del arco";
    }

    @Override
    public void prepararEntreneamiento() {
        System.out.println(getNombreYApellido()+ " - Preparando el entrenamiento");
    }

    @Override
    public void jugarPartido() {
        System.out.println(getNombreYApellido() + " - Jugando Partido");
    }
   
      @Override
    public String toString (){
        return super.toString() +"\nOcupacion: Entrenador" +  "\nSistema de juego: " + sistemaDeJuego +
                "\nEstilo: " + estilo;
    }
    
}
