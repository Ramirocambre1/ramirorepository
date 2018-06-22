/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfaces.JugarPartido;

/**
 *
 * @author usuario
 */
public class Futbolista extends Integrante implements JugarPartido{
    
    
    private int numeroCamiseta;
    private String puesto;

    public Futbolista(String nombreYApellido, int edad) {
        super(nombreYApellido, edad);
        numeroCamiseta = 1;
        puesto = "Aleteatorio";
    }
    
    @Override
    public void jugarPartido(){
        System.out.println(getNombreYApellido()+ " - Jugando Partido");
    }
    
      @Override
    public String toString (){
        return super.toString() + "\nOcupacion: Futbolista" + "\nNumero de Camiseta: " + numeroCamiseta +
                "\nPuesto: " + puesto;
    }
}
