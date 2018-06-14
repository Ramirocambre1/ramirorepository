package app;

import clases.Juegos;
import clases.Videoclub;

public class Main {

	public static void main(String[] args) {
		
		Juegos juego1=new Juegos("Bioshock","2kgames",10);
		juego1.agregarStock(10);
		Juegos juego2=new Juegos("Batman",12);
		juego2.agregarStock(12);
		
		Videoclub videoclub=new Videoclub();
		
		videoclub.agregarElementos(1, juego1);
		videoclub.agregarElementos(2, juego2);
		
		videoclub.listar();

	}

}
