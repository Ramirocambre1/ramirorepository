
package clases;

import interfaces.Asistir;
import interfaces.ViajarYConcentrar;

/**
 *
 * @author usuario
 */
public class Masajita extends Integrante implements Asistir, ViajarYConcentrar{
    
    private String titulo;
    private int aniosExperiencia;

    public Masajita(String nombreYApellido, int edad) {
        super(nombreYApellido, edad);
        titulo = "tecnico superior en masajismo profesional avanzado especializado";
        aniosExperiencia = 900; // como yoda
    }

    @Override
    public void asistir() {
        System.out.println(getNombreYApellido()+ " - Asistiendo");

    }
    
    @Override
    public String toString (){
        return super.toString() + "\nOcupacion: Masajista"+  "\nTitulo: " + titulo + "\nAnios Experiencia: " + aniosExperiencia;
    }
    
    
}
