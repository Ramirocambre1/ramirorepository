
package app;

import clases.SeleccionFutbol;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SeleccionFutbol afa = new SeleccionFutbol();
        afa.cargarPlantelJson();
        afa.mostrarSeleccion();
        afa.prepararEntrenamiento();
        afa.jugarPartido();
        afa.asistir();
        afa.viajar();
        afa.concentrar();
        afa.eliminarIntegrante("Myers Day");
        afa.mostrarSeleccion();
        System.out.println("Cantidad de integrantes de la seleccion: " + afa.cantidadDeIntegrantes());
    }

}
