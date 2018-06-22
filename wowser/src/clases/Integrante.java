
package clases;

import interfaces.ViajarYConcentrar;



/**
 *
 * @author usuario
 */
public class Integrante implements ViajarYConcentrar {
    private String nombreYApellido;
    private int edad;
    
    public Integrante (){
        nombreYApellido = "";
        edad = 0;
    }
    
    public Integrante (String nombreYApellido, int edad){
        this.nombreYApellido = nombreYApellido;
        this.edad = edad;
    }

    @Override
    public void viajar(){
        System.out.println(nombreYApellido + " - Viajando :)");
    }

    @Override
    public void concentrar(){
        System.out.println(nombreYApellido + " - Concentrando");
    }

    public String getNombreYApellido() {
        return nombreYApellido;
    }

    public int getEdad() {
        return edad;
    }
    
    @Override
    public String toString(){
        return "Nombre: " + nombreYApellido + "\nEdad: " + edad;
        
    }
}
