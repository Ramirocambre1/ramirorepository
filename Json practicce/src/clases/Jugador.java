package clases;

public class Jugador extends Persona {
	
	private int numero;
	private int puesto;
	
	public Jugador(String nombre, String apellido, int edad, int numero, int puesto) {
		super(nombre, apellido, edad);
		this.numero = numero;
		this.puesto = puesto;
	}
	
	
	

}
