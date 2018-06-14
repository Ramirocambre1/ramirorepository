package app;

import clases.Animal;
import clases.Gato;
import clases.Generica;
import clases.Perro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Perro perro1=new Perro("Dalmata",10,"Wow");
		Gato gato1=new Gato("Fold escoces", 12, "OMEGALUL");
		
		Generica<Animal>gen1=new Generica<Animal>();
		
		gen1.agregarelemento(1, perro1);
		gen1.agregarelemento(2, gato1);
		gen1.listar();

	}

}
