package clases;

import java.util.HashMap;

/**
 *
 * @author usuario
 */
public class Elemento {

    private String titulo;
    private boolean entregado;
    private String genero;
    private int duracion;
    private String creador;
    private int stock;
    private HashMap<Integer, String> registro; //

    public Elemento(int duracion) { // constructor para asignar la duracion por defecto de cada elemento
        titulo = "";
        entregado = false;
        genero = "";
        this.duracion = duracion;
        creador = "";
        stock = 0;
        registro = new HashMap<Integer, String>();
    }

    public Elemento(String titulo, String creador, int duracion) {
        this.titulo = titulo;
        entregado = false;
        genero = "";
        this.duracion = duracion;
        this.creador = creador;
        stock = 0;
        registro = new HashMap<Integer, String>();
    }

    public Elemento(String titulo, int duracion) {
        this.titulo = titulo;
        entregado = false;
        genero = "";
        this.duracion = duracion;
        creador = "";
        stock = 0;
        registro = new HashMap<Integer, String>();
    }

    public Elemento(String titulo, String genero, int duracion, String creador) { // constructor con todos los atributos menos entregado
        this.titulo = titulo;
        entregado = false;
        this.genero = genero;
        this.duracion = duracion;
        this.creador = creador;
        registro = new HashMap<Integer, String>();
    }

    public String getTitulo() {
        return titulo;
    }

    public String getGenero() {
        return genero;
    }

    public int getDuracion() {
        return duracion;
    }

    public String getCreador() {
        return creador;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public boolean compararTitulo(String titulo) { // retorna true si ambos string son iguales
        return this.titulo.equalsIgnoreCase(titulo);
    }

    @Override
    public String toString() {
        String mensaje = "\nEntregado: " + entregado + "\nGenero: " + genero;
        //cada elemento muestra a su manera los demas datos, excepto enregado y genero
        return mensaje;
    }

    public void entregar() {
        if (entregado != true && stock > 0) {
            entregado = true;
            stock--;
        }
    }

    public void devolver() {
        if (entregado != false) {
            entregado = false;
            stock++;
        }
    }

    public boolean isEntregado() {
        return entregado;
    }

    public boolean compararDuracion(int duracion) { // devuelve true si el atributo pasado por parametro es mayor
        boolean flag;
        if (duracion > this.duracion) { //  si la duracion pasada por parametro es mayor
            flag = true;
        } else {
            flag = false; // si es menor, false
        }
        return flag;
    }

    public void agregarStock(int numero) {
        stock = stock + numero;
    }
    
    

}
