
package clases;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Plantel<T> {

    private ArrayList<T> plantel;

    public Plantel() {
        plantel = new ArrayList<T>();
    }

    public void agregar(T dato) {
        plantel.add(dato);
    }

    public void eliminar(T dato) {
        for (int i = 0; i < plantel.size(); i++) {
            if (plantel.get(i).equals(dato)) {
                plantel.remove(i);
            }
        }
    }

    public void listar() {
        for (T elemento : plantel) {
            System.out.println("------------------------");
            System.out.println(elemento.toString());
        }
    }

    public T obtenerIntegrante(int i) {
        return plantel.get(i);
    }
    
    public int cantidadDeIntegrantes() {
        return plantel.size();
    }
}
