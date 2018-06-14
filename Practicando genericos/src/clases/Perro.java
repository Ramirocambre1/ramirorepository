package clases;

public class Perro  extends Animal{

	public Perro(String raza, int velocidad, String hablar) {
		super(raza, velocidad, hablar);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void cantar() {
	
		System.out.println("Guau");
		
		
	}

}
