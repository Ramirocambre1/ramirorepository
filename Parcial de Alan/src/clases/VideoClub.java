/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 *
 * @author usuario
 */
public class VideoClub {

    private HashMap<Integer, Elemento> elementos;
    private int entregados;

    public VideoClub() {
        elementos = new HashMap<Integer, Elemento>();
        entregados = 0;
    }

    public void añadirElementos(Integer numero, Elemento elemento) {
        elementos.put(numero, elemento);
    }

    public boolean eliminarElemento(Integer numero) {
        boolean flag = false;
        Elemento el;
        Iterator iterator = elementos.entrySet().iterator(); // para recorrer un map hay q usar un iterator
        while (iterator.hasNext() && flag == false) {
            Map.Entry me = (Map.Entry) iterator.next();
            el = (Elemento) me.getValue();
            if (el.isEntregado() == false && me.getKey() == numero) {
                elementos.remove(numero);
                flag = true;
            }
        }
        return flag;
    }

    public void listarElementos() {
        Iterator iterator = elementos.entrySet().iterator(); // para recorrer un map hay q usar un iterator
        // Elemento el;
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            System.out.println("\nIdentificador: " + me.getKey());
            Elemento el = (Elemento) me.getValue();
            System.out.println(el.toString());
        }
    }

    public void entregar(Integer numero) {
        boolean flag = false;
        Elemento el;
        Iterator iterator = elementos.entrySet().iterator(); // para recorrer un map hay q usar un iterator
        while (iterator.hasNext() && flag == false) {
            Map.Entry me = (Map.Entry) iterator.next();
            el = (Elemento) me.getValue();
            if (me.getKey() == numero) {
                el.entregar();
                flag = true;
            }
        }
        entregados++;
    }

    public void devolver(Integer numero) {
        boolean flag = false;
        Elemento el;
        Iterator iterator = elementos.entrySet().iterator(); // para recorrer un map hay q usar un iterator
        while (iterator.hasNext() && flag == false) {
            Map.Entry me = (Map.Entry) iterator.next();
            el = (Elemento) me.getValue();
            if (me.getKey() == numero) {
                el.devolver();
                flag = true;
            }
        }
        entregados--;
    }

    public int cantidadDeEntregados() {
        return entregados;
    }

    public void juegoConMasHoras() {
        Elemento el;
        Elemento mayor = new Elemento(0); // para comparar duraciones
        Iterator iterator = elementos.entrySet().iterator(); // para recorrer un map hay q usar un iterator
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            el = (Elemento) me.getValue();
            if (el instanceof Juegos) {
                if (mayor.compararDuracion(el.getDuracion()) == true) {
                    mayor = el;
                }
            }
        }
        System.out.println("Juego con mayor duracion: " + mayor.toString());
    }
        public void peliculaConMasHoras (){
        Elemento el;
        Elemento mayor = new Elemento(0); // para comparar duraciones
        Iterator iterator = elementos.entrySet().iterator(); // para recorrer un map hay q usar un iterator
        while (iterator.hasNext()) {
            Map.Entry me = (Map.Entry) iterator.next();
            el = (Elemento) me.getValue();
            if ( el instanceof Peliculas) {
                if (mayor.compararDuracion(el.getDuracion()) == true){
                    mayor = el;
            }
            }
        }
        System.out.println("Juego con mayor duracion: " + mayor.toString());
    }

}
