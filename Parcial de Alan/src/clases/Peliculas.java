package clases;

/**
 *
 * @author usuario
 */
public class Peliculas extends Elemento {

    public Peliculas() { // constructor por defecto
        super(60);
    }

    public Peliculas(String titulo, String creador) {
        super(titulo, creador, 60);
    }

    public Peliculas(String titulo, String genero, int duracion, String creador) {
        super(titulo, genero, duracion, creador);
    }

    @Override
    public String toString() {
        String mensaje = "\nPelicula: " + getTitulo() + "\nDuracion: " + getDuracion() + " minutos" + super.toString()
                + "\nCreador: " + getCreador();
        return mensaje;
    }
}
