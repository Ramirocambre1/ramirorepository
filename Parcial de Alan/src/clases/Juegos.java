package clases;

/**
 *
 * @author usuario
 */
public class Juegos extends Elemento {

    public Juegos() { // constructor por defecto
        super(10);
    }

    public Juegos(String titulo, int horasEstimadas) {
        super(titulo, horasEstimadas);
    }

    public Juegos(String titulo, String genero, int horasEstimadas, String compañia) {
        super(titulo, genero, horasEstimadas, compañia);
    }

    @Override
    public String toString() {
        String mensaje = "\nJuego: " + getTitulo() + "\nHoras estimadas: " + getDuracion() + " horas" + super.toString()
                + "\nCompañia: " + getCreador();
        return mensaje;
    }
}
