/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import clases.Juegos;
import clases.Peliculas;
import clases.VideoClub;

/**
 *
 * @author usuario
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Peliculas peli = new Peliculas("Star Wars", "Ciencia Ficcion", 100, "jorge");
        peli.agregarStock(10);
        Peliculas peli2 = new Peliculas ("El señor de los anillos", "Peter");
        peli2.agregarStock(14);
        Juegos juego = new Juegos("Bioshock", "Fps", 15, "2k games");
        juego.agregarStock(60);
        Juegos juego2 = new Juegos();
        juego2.agregarStock(40);
        VideoClub videoclub = new VideoClub();
        videoclub.añadirElementos(1,peli);
        videoclub.añadirElementos(2,peli2);
        videoclub.añadirElementos(3,juego);
        videoclub.añadirElementos(4,juego2);
        videoclub.listarElementos();
        videoclub.eliminarElemento(3);
        videoclub.entregar(1);
        videoclub.entregar(1);
        videoclub.entregar(2);
        videoclub.listarElementos();
        System.out.println("Cantidad de Entregados: " + videoclub.cantidadDeEntregados());
        videoclub.juegoConMasHoras();
        videoclub.peliculaConMasHoras();

    }
    
}
